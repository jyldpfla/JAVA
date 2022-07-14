-- 부서 id가 90인 직원들 인원 수
SELECT DEPARTMENT_ID, COUNT(*) FROM employees
	GROUP BY DEPARTMENT_ID; -- 같은 DEPARTMENT_ID를 가진 사원끼리 그룹화
    
-- 부서별 최고 연봉, 최저 연봉, 평균 연봉, 연봉 합
SELECT DEPARTMENT_ID, MAX(SALARY), MIN(SALARY), AVG(SALARY), SUM(SALARY)
FROM employees
GROUP BY DEPARTMENT_ID;

SELECT JOB_ID FROM employees GROUP BY JOB_ID; -- 중복 제거
-- 그룹화해서 중복 제거시 하나의 그룹으로 묶여지므로, 값이 하나만 나옴
SELECT DISTINCT JOB_ID, LAST_NAME FROM employees; -- 중복 제거
-- 조회를 할 때, 컬럼 값들이 행이 완벽하게 똑같아야 중복 제거

-- 직원 테이블 LAST_NAME을 중복 제거하고 조회
SELECT DISTINCT LAST_NAME FROM employees;
-- 직원 테이블 LAST_NAME 그룹 별로 인원 수 조회
SELECT LAST_NAME, COUNT(*) FROM employees GROUP BY LAST_NAME;
-- LAST_NAME 그룹의 카운트가 2이상인 행들만 조회
SELECT LAST_NAME, COUNT(*) 
FROM employees 
GROUP BY LAST_NAME 
HAVING COUNT(*) > 1;

-- 위의 성을 가지는 직원 목록 조회
SELECT * FROM employees WHERE LAST_NAME IN (
	SELECT LAST_NAME
    FROM employees
	GROUP BY LAST_NAME
    HAVING COUNT(*) > 1
    );

-- 5번째로 적게 받는 직원들 목록
SELECT * FROM employees
WHERE SALARY = 
(SELECT DISTINCT SALARY FROM employees ORDER BY SALARY LIMIT 1 OFFSET 4);

-- 상위 연봉 50명(같은 연봉에 대해서 FIRST_NAME이 빠른 친구)에 대해서 부서별로 몇 명씩 있는지
SELECT DEPARTMENT_ID, COUNT(*) FROM
(SELECT * FROM employees ORDER BY SALARY DESC, FIRST_NAME ASC LIMIT 50) AS A -- 하나의 테이블로 사용하기 위해 별명 지어줌
GROUP BY DEPARTMENT_ID;