INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO users(username, password) VALUES ('user1','$2a$12$1k34YdrmxBkVborQvZLh2OUvX1S80GVVQjZJ5H55y1eez7XV.nV06');
INSERT INTO users(username, password) VALUES ('admin','$2a$12$1k34YdrmxBkVborQvZLh2OUvX1S80GVVQjZJ5H55y1eez7XV.nV06');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1); -- user1 with ROLE_USER
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2); -- admin with ROLE_ADMIN
INSERT INTO servicios_adicionales (precio_servicio, nombre_servicio) VALUES (20, 'Piscina');
INSERT INTO servicios_adicionales (precio_servicio, nombre_servicio) VALUES (35, 'Comida a cuarto');
INSERT INTO servicios_adicionales (precio_servicio, nombre_servicio) VALUES (45, 'Buffet');
INSERT INTO servicios_adicionales (precio_servicio, nombre_servicio) VALUES (30, 'Lavanderia');