/*
	부서 -- (employees.department_id -참-조-> departments.department_id)
    직책 -- (employees.job_id -참-조-> job.job_id)
    매니저 -- (departments.MANAGER_ID -참-조-> employees.employee_id)
	1. 모든 부서의 부서명과 관리자 (외래키 MANAGER_ID -> employees (employee_id 참조))의 이름
	2. 부서명이 IT로 시작하는 부서명과 근무하는 직원들의 이름 조회
    3. 모든 직원들의 이름과 직책(JOB_TITLE) 조회
    4. 직원의 해당 직책의 jobs 테이블에 책정된 최대 연봉(MAX_SALARY) 이상의 연봉을 받는 직원 이름, 현재 연봉, 최대연봉 조회
    5. 부서의 (COUNTRY_ID)가 'US'인 부서에서 근무하는 직원명과 부서명 조회
*/	

SELECT * FROM department A
LEFT JOIN locations B ON A.location_id = B.location_id
LEFT JOIN countries C ON B.country_id = C.country_id;

SELECT * FROM employees;
SELECT * FROM departments;
SELECT * FROM hr.jobs;

-- 1. 모든 부서의 부서명과 관리자 (외래키 MANAGER_ID -> employees (employee_id 참조))의 이름
SELECT A.FIRST_NAME, A.LAST_NAME, B.DEPARTMENT_NAME FROM employees AS A
RIGHT JOIN departments AS B ON A.EMPLOYEE_ID = B.MANAGER_ID;

-- 2. 부서명이 IT로 시작하는 부서명과 근무하는 직원들의 이름 조회
SELECT DEPARTMENT_NAME, B.FIRST_NAME, B.LAST_NAME FROM departments AS A
LEFT JOIN employees AS B ON A.DEPARTMENT_ID = B.DEPARTMENT_ID -- ON은 외래키를 비교(테이블 두개 컬럼 비교)
WHERE DEPARTMENT_NAME LIKE 'IT%'; -- 특정한 조건 비교

-- 3. 모든 직원들의 이름과 직책(JOB_TITLE) 조회
SELECT JOB_TITLE, FIRST_NAME, LAST_NAME FROM employees AS A
LEFT JOIN jobs AS B ON A.JOB_ID = B.JOB_ID;

-- 4. 직원의 해당 직책의 jobs 테이블에 책정된 최대 연봉(MAX_SALARY) 이상의 연봉을 받는 직원 이름, 현재 연봉, 최대연봉 조회
SELECT B.JOB_TITLE, A.FIRST_NAME, A.LAST_NAME, A.SALARY, B.MAX_SALARY FROM employees AS A
 JOIN jobs AS B ON A.JOB_ID = B.JOB_ID AND A.SALARY >= B.MAX_SALARY;
 
 -- 5. 부서의 (COUNTRY_ID)가 'US'인 부서에서 근무하는 직원명과 부서명 조회


