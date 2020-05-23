use bugtracker;
CREATE TABLE item
(
    itemId INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    itemTitle VARCHAR(30) NOT NULL UNIQUE,
    statusId INT UNSIGNED,
    typeId INT UNSIGNED,
    FOREIGN KEY(statusId) REFERENCES status(statusId),
    FOREIGN KEY(typeId) REFERENCES type(typeId)

)
