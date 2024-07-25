-- usando SELECT en products
SELECT * FROM products; 

-- Qué categorias estás usando en los productos?
/*
 Distinct se utiliza para elimar duplicados y
 devolver solo las filas distintas en el resultado.
*/
SELECT 
	DISTINCT fk_category_id 
    FROM products;
    
-- Cuántas categorías están siendo utilizadas por los productos?
/*
 COUNT cuenta el número de filas de un conjunto de resultados
*/
SELECT
	 COUNT(DISTINCT fk_category_id) AS "Categorias en uso"
    FROM products;

/*
  LIMIT especifica el número máximo de filas que
  devuelve la consulta.
  OFFSET omite un número específico de filas antes 
  de comenzar a devolver las filas en el conjunto
  de resultados.
*/
SELECT * FROM products LIMIT 5 OFFSET 6;

/*
  ORDER BY ordena los resultados de una
  consulta en orden ascendente (ASC) o descendente (DESC).
*/
-- Ordenar por precio
SELECT * FROM products ORDER BY price;

-- Ordenar por precio de forma descendente
SELECT * FROM products ORDER BY price DESC, name ASC;

/*
 WHERE se utiliza para filtrar los registros de una tabla
 que cumple con una condición específica. Esto te permite
 seleccionar solo aquellos registros que te interesan
 basándote en creterios como valores de columnas, comparaciones
 o condiciones más complejas.
*/
-- Mostrar todos los productos del category_id = 4
SELECT * FROM products WHERE fk_category_id = 4;

-- Mostrar todos los productos que su precio sea mayor a $500
SELECT * FROM products WHERE price > 500;

-- Mostrar todos los productos que su precio sea entre 100 y 500
SELECT * FROM products WHERE price BETWEEN 100 AND 500;
SELECT * FROM products WHERE price >= 100 AND price <=  500;
-- SELECT * FROM products WHERE price >= 100 && price <=  500;

-- Mostrar todos los productos que su precio NO sea entre 100 y 500
--  Odena los resultados de forma ascedente en el nombre
SELECT * 
FROM products 
WHERE price NOT BETWEEN 100 AND 500
ORDER BY name ASC
LIMIT 100;

-- Mostrar todos los elementos que no sean del category_id 4
SELECT * FROM products WHERE fk_category_id != 4;

-- Insertar valores con precio name 
INSERT INTO products(name, fk_category_id) VALUES ("Raqueta de Squash",1);
INSERT INTO products(name, fk_category_id) VALUES ("Tenis para correr",1);
INSERT INTO products(name, fk_category_id) VALUES ("Bicicleta rodad 26 pulgadas",1);
INSERT INTO products(name, fk_category_id) VALUES ("Bicilceta rodada 22 pulgadas",1);

-- Mostrar los productos que tenga en precio null;
SELECT * FROM products WHERE price IS NULL;

/*
  IN se utiliza para comprobar si un valor específico existe
  dentro de un conjunto de valores. Útil para simplificar las
  consultas que requieren verificar múltiples valores para una
  columna específica en lugar de usar múltiples condiciones
  con el operador OR
*/
-- Mostrar los productos que tenga el category_id = 1, 4 y 5
SELECT * FROM products
	WHERE fk_category_id = 1 OR fk_category_id = 4 OR fk_category_id = 5
    ORDER BY fk_category_id DESC;
    
SELECT * FROM products
	WHERE fk_category_id IN (1,4,5)
    ORDER BY fk_category_id DESC;
    
-- El precio mayor de la columan price
SELECT MAX(price) FROM products;  -- 18999.00 
-- El precio menor de la columna price
SELECT MIN(price) FROM products;
-- EL promedio de precio
SELECT AVG(price) FROM products;
-- Sumatorio de los registros de una consulta
SELECT SUM(price) FROM products;
    
    
/*
 Consultas anidadas( subconsultas, subqueries)
 Una consulta dentro de otra consulta
 
*/
-- Los productos que tenga en mayor precio.
SELECT product_id, name, price FROM products WHERE price = 18999;

-- Esto no lo debemos hacer por que solo nos mostraría 1 producto
SELECT 
	product_id, name, price 
    FROM products
    ORDER BY price DESC
    LIMIT 1;

-- Aplicando la consulta anidad
SELECT 
	product_id, name, price 
    FROM products 
    WHERE price = ( SELECT MAX(price) FROM products );

-- Mostrar todos los productos que el precio sea mayor al promedio
-- de los precios.

