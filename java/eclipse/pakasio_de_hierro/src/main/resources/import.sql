
INSERT INTO roles(id, name, description) VALUES (1,'CUSTOMER', 'Cliente de la ecommerce');
INSERT INTO roles(id, name, description) VALUES (2,'ADMIN', 'Administrador de la ecommerce');
INSERT INTO roles(id, name, description) VALUES (3,'WAREHOUSE_MANAGER', 'Administrador del almacen');

INSERT INTO users(firstname, lastname, email, password, avatar, active) VALUES ('Duende', 'Malito', 'duende@gmail.com', '$2a$10$Ulquu8HMe6Nzfq6h.iz4hOIndHXDr86qDLaT7GYItibzxnyaEPtPG', 'https://randomuser.me/api/portraits/lego/1.jpg', 1)
INSERT INTO user_has_roles(user_id, role_id) VALUES (1, 1);
INSERT INTO user_has_roles(user_id, role_id) VALUES (1, 2);

