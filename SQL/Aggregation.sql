select * from scott.emp

--calculate the average salary of each department

SELECT ename, ROUND(AVG(sal), 0) AS avg_salary
FROM scott.emp
GROUP BY ename
ORDER BY ename;

--returns the minimum salary of the employees in each department
SELECT ename, MIN(sal) min_salary
FROM scott.emp
GROUP BY ename
ORDER BY ename;

--returns the highest salary of employees in each department
SELECT ename, MAX(sal) highest_salary
FROM scott.emp
GROUP BY ename
ORDER BY ename;

--return the headcount of each department
SELECT ename, COUNT(*) headcount
FROM scott.emp
GROUP BY ename
ORDER BY ename;

--returns the total salary of all employees in each department
SELECT empno, SUM(sal)
FROM scott.emp
GROUP BY empno;

SELECT empno, COUNT(empno) headcount
FROM scott.emp
GROUP BY empno;

SELECT empno, COUNT(empno) headcount
FROM scott.emp
GROUP BY empno
ORDER BY headcount DESC;

SELECT department_id, COUNT(employee_id) headcount
FROM employees
GROUP BY department_id
HAVING headcount > 5
ORDER BY headcount DESC;