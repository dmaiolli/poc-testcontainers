create table car(
    id bigint not null auto_increment,
    name varchar(50) not null,
    model varchar(50) not null,
    primary key(id)
);

insert into car values('Golf', 'VW');
