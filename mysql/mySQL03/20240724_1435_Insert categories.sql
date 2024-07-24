-- Insertar 5 categorias de productos.
USE elektra;

INSERT INTO categories (name, description) VALUES ("Deportes","Deportes al aire libre");
INSERT INTO categories (name, description) VALUES ("Linea Blanca","Cocina");
INSERT INTO categories (name, description) VALUES ("Hogar","Decoracion");
INSERT INTO categories (name, description) VALUES ("Moda y accesorios","Joyería");
INSERT INTO categories (name, description) VALUES ("Cómputo","Portátiles");
INSERT INTO categories (name, description) VALUES ("Herramientas","Plomería");

SELECT * FROM categories;