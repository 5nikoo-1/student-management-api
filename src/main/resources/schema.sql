CREATE DATABASE IF NOT EXISTS studentdb;
USE studentdb;

CREATE TABLE IF NOT EXISTS students (
    id     INT AUTO_INCREMENT PRIMARY KEY,
    name   VARCHAR(100) NOT NULL,
    email  VARCHAR(100) NOT NULL,
    course VARCHAR(100) NOT NULL,
    grade  DOUBLE NOT NULL
);

-- Sample data
INSERT INTO students (name, email, course, grade) VALUES
('Nika Oragvelidze', 'nika@example.com', 'Java Backend', 95.0),
('Ana Beridze',      'ana@example.com',  'Data Science',  88.5),
('Giorgi Lomidze',   'giorgi@example.com','Web Development', 91.0);