DROP TABLE IF EXISTS cloth;
CREATE TABLE cloth(
      id int(11) NOT NULL AUTO_INCREMENT,
      name varchar(255) not NULL,
      color varchar(255) not NULL,
      style varchar(255) not NULL,
      price double DEFAULT 0,
      stock double DEFAULT 0,
      PRIMARY KEY(id),
      index(name),
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
