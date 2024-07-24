-- Agregar 5 productos de las categorias existentes.
USE elektra;
-- Diana Laura
INSERT INTO products (name, price, fk_category_id)
VALUES
("Raqueta de tenis", 280.00, 1),
("Microondas", 2079.35, 2),
("Cascada de grifo", 359.00, 6),
("Laptop Gamer HP Victus 15", 18999.00, 5),
("Collar corazones", 2295.00, 4);

-- Abigail
INSERT INTO products (name , price, fk_category_id) VALUES ("Raqueta", 500, 1);
INSERT INTO products (name , price, fk_category_id) VALUES ("Tacones GUCCI", 1500, 4);
INSERT INTO products (name , price, fk_category_id) VALUES ("Lampara de escritorio", 900, 3);
INSERT INTO products (name , price, fk_category_id) VALUES ("Chamarra Nike", 1200, 4);
INSERT INTO products (name , price, fk_category_id) VALUES ("Pechera para correr", 1000, 1);

-- Maricela
INSERT INTO products (name, price, fk_category_id) VALUES ('Balón de fútbol', 20.99, 1);
INSERT INTO products (name, price, fk_category_id) VALUES ('Juego de sábanas', 39.99, 3);
INSERT INTO products (name, price, fk_category_id) VALUES ('Collar de plata', 49.99, 4);

-- Marbe
INSERT INTO products (name, price, fk_category_id) VALUES ("Balón de Futbol", 150.00,1);
INSERT INTO products (name, price, fk_category_id) VALUES ("Estufa", 4500, 2);
INSERT INTO products (name, price, fk_category_id) VALUES ("Espejo", 1050, 3);
INSERT INTO products (name, price, fk_category_id) VALUES ("Anillo", 500,  4);
INSERT INTO products (name, price, fk_category_id) VALUES ("Laptop", 15000, 5);
INSERT INTO products (name, price, fk_category_id) VALUES ("Taladro", 3000, 6);

SELECT * FROM products;

