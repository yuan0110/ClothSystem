
DROP TABLE IF EXISTS clothorder;

CREATE TABLE clothorder(
    id int(11) NOT NULL AUTO_INCREMENT,
    client      varchar(255) default null,
    producetime   TIMESTAMP default null,
    cname   varchar(255) default null,
    cprice      double default null,
    cnumber     double default null,
    csum        double default null,
    handerman varchar (255) default null,
    deliveryman varchar(255) default null,
    endtime     TIMESTAMP       default null,
    PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
