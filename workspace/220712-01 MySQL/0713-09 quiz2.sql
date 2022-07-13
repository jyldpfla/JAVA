
SELECT * FROM employees;
-- 각 직원들의 이름과 연봉, (연봉 - 평균연봉)
SELECT FIRST_NAME, LAST_NAME, SALARY, SALARY - (SELECT AVG(SALARY) FROM employees) FROM employees;

-- 최고 연봉직원과 최저 연봉 직원들의 이름을 조회해보세요
SELECT FIRST_NAME, LAST_NAME FROM employees WHERE SALARY IN (( SELECT MAX(SALARY) FROM employees ), ( SELECT MIN(SALARY) FROM employees ));

-- 평균 연봉보다 높게 받는 직원 조회
SELECT * FROM employees WHERE SALARY >= 
(SELECT AVG(SALARY) FROM employees);

-- 부서명이 IT로 시작하는 직원들의 수(카운트)를 조회해보세요.
SELECT COUNT(*) FROM employees WHERE DEPARTMENT_ID IN 
(SELECT DEPARTMENT_ID FROM departments WHERE DEPARTMENT_NAME LIKE "IT%");

-- Douglas Grant의 이메일을 'dog@naver.com'으로 변경해보세요.
UPDATE employees SET EMAIL = 'dog@naver.com' WHERE FIRST_NAME = "Douglas" AND LAST_NAME = "Grant";

-- Ellen Abel과 같은 부서에서 근무하는 직원을 연봉 내림차순으로 정렬해서 조회
SELECT * FROM employees WHERE DEPARTMENT_ID IN
(SELECT DEPARTMENT_ID FROM employees WHERE FIRST_NAME = "Ellen" AND LAST_NAME = "Abel")
ORDER BY SALARY DESC;

-- 자기가 속한 부서의 평균보다 많이 받는 직원
SELECT DEPARTMENT_ID FROM employees;

SELECT * FROM employees WHERE SALARY > (SELECT AVG(SALARY) FROM employees WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID FROM employees) AS 부서);