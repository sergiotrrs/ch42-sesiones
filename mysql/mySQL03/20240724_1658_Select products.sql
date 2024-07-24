/* 
La instrucción SELECT en SQL se utiliza para consultar 
datos de una o más tablas en una base de datos. 
Es una de las instrucciones más básicas y poderosas en SQL
, permitiendo recuperar información específica según 
los criterios definidos.
*/

-- Operaciones matemáticas
SELECT 6%2; -- Residuo
SELECT 4*4; -- Multiplicación

-- Funciones matemáticas
SELECT ABS(-6); -- Valor absoluto de un número
SELECT CEIL(8.1); -- Redondear al número entero superior: 9
SELECT CEIL(8.9); -- 9
SELECT FLOOR(8.1); -- Redondear al número entereo inferior: 8
SELECT FLOOR(8.9); -- 8
SELECT ROUND(8.5); -- Redondea haía arriba si es .5 o superior: 9
SELECT ROUND(8.49); -- 8
SELECT PI(); -- 3.141593
SELECT RAND(); -- número aleatorio entre 0 y 1 (sin incluir)
 
 -- Número aleatorio entre el 0 y 10 (sin incluir). Solo números enteros
 SELECT RAND() * 10;
 SELECT ROUND(RAND() * 10);

-- Número aleatorio entre el 20 y 50, Solo número enteros
SELECT FLOOR( RAND() * 31 ) + 20;

-- Selecccionar todo los campos (*) de una tabla
SELECT * FROM products;

-- Especificar los campos de una tabla
SELECT name, price FROM products;

-- Usar un alias como el nombre de los campos
SELECT name AS "nombre", price AS "precio" from products;


 
 








