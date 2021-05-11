
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

drop table if exists stockout;
create table stockout(
                       id int(11) not null,
                       stock double default 0.0,
                       handerman varchar(255) default null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into stockout values(1,1.0,"reception");
select * from stockout;
