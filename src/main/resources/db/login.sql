drop table if exists userinfo;
create table userinfo(
    account varchar(255) unique not null,
    password varchar(255) not null,
    username varchar (255) not null,
    phone varchar(255) default null,
    role varchar(255) not null,
    sex varchar(4) not null,
    onwork int default,
    primary key(account)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into userinfo values("reception","111111","zhangRece","15918843439","reception","女",1);
insert into userinfo values("deliveryman","111111","zhangDeli","15918843439","deliveryman","男",1);
insert into userinfo values("admin","111111","zhangAdmin","15918843439","admin","男",1);

