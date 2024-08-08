
INSERT INTO roles(id, name, description) VALUES (1,'CUSTOMER', 'Cliente de la ecommerce');
INSERT INTO roles(id, name, description) VALUES (2,'ADMIN', 'Administrador de la ecommerce');
INSERT INTO roles(id, name, description) VALUES (3,'WAREHOUSE_MANAGER', 'Administrador del almacen');

INSERT INTO users(id, firstname, lastname, email, password, active) VALUES (1,'Duende', 'Malito', 'duende@gmail.com', '$2a$10$Ulquu8HMe6Nzfq6h.iz4hOIndHXDr86qDLaT7GYItibzxnyaEPtPG', 1)
INSERT INTO user_has_roles(user_id, role_id) VALUES (1, 1);
INSERT INTO user_has_roles(user_id, role_id) VALUES (1, 2);