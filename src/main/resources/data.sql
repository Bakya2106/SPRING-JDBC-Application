create table person(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);

insert into person
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1001, 'Bakya', 'Madurai', CURRENT_TIMESTAMP());
insert into person
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1002, 'Keerthi', 'Chennai', CURRENT_TIMESTAMP());
insert into person
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1003, 'Dharshana', 'Madurai', CURRENT_TIMESTAMP());
