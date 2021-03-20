
DROP TABLE IF EXISTS cloth;
DROP TABLE IF EXISTS user;
CREATE TABLE cloth(
                     id int(11) NOT NULL AUTO_INCREMENT,
                     name varchar(255) DEFAULT NULL,
                     price double DEFAULT NULL,
                     stock double DEFAULT NULL,
                     PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cloth(id, name, price, stock)
VALUES(1,'cloth1',1,1);
INSERT INTO cloth(id, name, price, stock)
VALUES(2,'cloth1',1,1);

CREATE TABLE USER(
                     id int(11) NOT NULL AUTO_INCREMENT,
                     name varchar(255) DEFAULT NULL,
                     role varchar(255) DEFAULT NULL,
                     PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO USER(id, name, role)
VALUES (1,'reception zhang ','reception');
INSERT INTO USER(id, name, role)
VALUES (2,'deliveryman zhang ','deliveryman');
INSERT INTO USER(id, name, role)
VALUES (3,'administrator zhang ','administrator');


DROP TABLE IF EXISTS clothorder;

CREATE TABLE clothorder
(
    id int(11) NOT NULL AUTO_INCREMENT,
    client      varchar(255) default null,
    producetime   DATE default null,
    clothname   varchar(255) default null,
    cprice      double default null,
    cnumber     double default null,
    csum        double default null,
    deliveryman varchar(255) default null,
    endtime     DATE         default null,
    PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
