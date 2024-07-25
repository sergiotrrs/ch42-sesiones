/*
 JOINS
 Se utiliza para combinar filas de dos o más tablas, basándose
 en una columna relaciona entre ellas.
 
 INNER JOIN: Devuelve registros cuando hay coinidencia en ambas tablas
 
 LEFT JOIN: Devuelve todos los registros de la tabla izquierda
  y los registros coincidentes de la tabla derecha, Si no hay coincidencia
  devuelve NULL en las columnas de la tabla derecha.
 
 RIGH JOIN: Devuelve todos los registros de la tabla derecha
  y los registros coincidentes de la tabla izquierda, Si no hay coincidencia
  devuelve NULL en las columnas de la tabla izquierda.

*/

SELECT *
	FROM products
    INNER JOIN categories
    ON products.fk_category_id = categories.category_id;
    
-- Mostrar ID producto, nombre, precio y nombre de la categoria a la que pertenece

SELECT * FROM products;

SELECT
	product_id,
    products.name,
    price,
    categories.name AS "category name"
    FROM products
    INNER JOIN categories
    ON products.fk_category_id = categories.category_id;

SELECT
	product_id,
    p.name,
    price,
    c.name AS "category name"
    FROM products p
    INNER JOIN categories c
    ON p.fk_category_id = c.category_id;
