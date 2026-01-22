CREATE TABLE salesman (
    salesman_id int PRIMARY KEY,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    commission int
);
desc salesman;
-- Insert one row
INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);
-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;
-- View data from all columns
SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

alter table salesman
add salary INT;

ALTER TABLE salesman
DROP COLUMN salary;

UPDATE salesman
SET commission=20
WHERE salesman_id= 5005;

DELETE FROM salesman WHERE salesman_name = 'McLyon';

SELECT * FROM salesman ORDER BY commission DESC;

UPDATE salesman
SET commission = 20
WHERE salesman_id = 5005;

DELETE FROM salesman
WHERE salesman_name = 'Pit Alex';

SELECT DISTINCT commission
FROM salesman
ORDER BY commission;