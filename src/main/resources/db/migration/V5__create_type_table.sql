use bugtracker;
CREATE TABLE type
(
    typeId INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    typeName VARCHAR(30) NOT NULL UNIQUE
);