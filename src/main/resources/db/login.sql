drop table if exists userinfo;
create table userinfo(
    username varchar(255) not null,
    password varchar(255) not null,
    phonenumber varchar(255) default null,
    role varchar(255) not null,
    onwork int default 1
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into userinfo values("reception","111111","11111111111","reception",1);
insert into userinfo values("deliveryman","111111","11111111111","deliveryman",1);
insert into userinfo values("admin","111111","11111111111","admin",1);

