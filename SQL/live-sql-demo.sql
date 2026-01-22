create table salesman(
    salesman_id  int not null,
    salesman_name varchar2(20),
    salesman_city varchar2(20),
    commision int
)

describe salesman;

insert all
    into salesman values(5001, 'James Hoog', 'New York', 15)
    into salesman values(5002, 'Nail Knite', 'Paris', 13)
    into salesman values(5001, 'Pit Alex', 'London', 11)
    into salesman values(5001, 'MCLyon', 'Paris', 14)
    into salesman values(5001, 'Paul Adam', 'Rome' , 13)
    into salesman values(5001, 'Lausen Hen', 'Sen Jose' , 12)
select 1 from dual;

select * from salesman;