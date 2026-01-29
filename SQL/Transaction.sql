-- Create a table named orders
create table CUSTOMERS(
    id int primary key, name varchar(255), age int,
    address varchar(255), salary int);

-- Add values to the table
INSERT ALL
    INTO CUSTOMERS VALUES(1, 'Ramesh',  32, 'Ahmedabad',   2000) 
    INTO CUSTOMERS VALUES(2, 'Khilan',  25,  'Delhi', 1500)
    INTO CUSTOMERS VALUES(3,  'Kaushik', 23,  'Kota', 2000)
    INTO CUSTOMERS VALUES(4, 'Chaitali', 25, 'Mumbai', 6500)
    INTO CUSTOMERS VALUES(5,  'Hardik', 27,  'Bhopal', 8500 )
    INTO CUSTOMERS VALUES(6 , 'Komal',  22,  'MP', 4500)
    INTO CUSTOMERS VALUES(7, 'Muffy', 24, 'Indore', 10000)
   
SELECT 1 FROM DUAL;

select * from CUSTOMERS

-- DELETE the records
DELETE FROM CUSTOMERS WHERE AGE = 25;

-- Commit the transaction
COMMIT;
ROLLBACK;

SAVEPOINT SP1;

DELETE FROM CUSTOMERS WHERE ID=1;

SAVEPOINT SP2;

DELETE FROM CUSTOMERS WHERE ID=2;

ROLLBACK TO SP2;