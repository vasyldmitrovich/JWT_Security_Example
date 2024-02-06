INSERT INTO roles(name)	VALUES ('ROLE_ADMIN');
INSERT INTO roles(name)	VALUES ('ROLE_MODERATOR');
INSERT INTO roles(name)	VALUES ('ROLE_USER');

INSERT INTO users (email, password, username) VALUES ('admin@gmail.com', '$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6', 'Bob_Admin');
INSERT INTO users (email, password, username) VALUES ('mod@gmail.com', '$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6', 'Jon_Moderator');
INSERT INTO users (email, password, username) VALUES ('user@gmail.com', '$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6', 'Alex_User');
INSERT INTO users (email, password, username) VALUES ('multiuser@gmail.com', '$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6', 'Sam_Multi_User');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2);
INSERT INTO user_roles (user_id, role_id) VALUES (3, 3);
INSERT INTO user_roles (user_id, role_id) VALUES (4, 2);
INSERT INTO user_roles (user_id, role_id) VALUES (4, 3);

--password for all users is: password
