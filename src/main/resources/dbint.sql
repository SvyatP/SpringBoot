CREATE DATABASE if not exists springboot;
USE springboot;
CREATE TABLE users (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(255),
                      last_name VARCHAR(255),
                      email VARCHAR(255),
                      password VARCHAR(255)
);
INSERT INTO users (name, last_name, email, password)
VALUES
    ('John', 'Doe', 'john.doe@example.com', 'password123'),
    ('Jane', 'Smith', 'jane.smith@example.com', 'password456');



