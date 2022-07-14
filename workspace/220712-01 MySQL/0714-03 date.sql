SELECT * FROM employees;

DESC employees;

-- MySQL 날짜 : DATE
-- 시간 : TIME
-- 날짜 시간 : DATETIME / TIMESTAMP

SELECT CURRENT_DATE();
SELECT CURRENT_TIME();
SELECT CURRENT_TIMESTAMP();

SELECT DATE '2022-07-14';
SELECT TIME '12:05:33';

-- HIRE_DATE가 1987년 6월인 직원 목록
SELECT * FROM employees 
WHERE HIRE_DATE BETWEEN '1987/06/01' AND '1987/06/30';
-- 년월일 분리 /든 -든 날짜로 MYSQL이 앞 기준이 날짜면 그에 맞춰 자동으로 날짜로 인식

SELECT ADDDATE('1987-06-01', 40);
SELECT SUBDATE('1987-06-01', 1);
SELECT DATE_ADD('1987-06-01', INTERVAL 40 DAY);
SELECT DATE_SUB('1987-06-01', INTERVAL 1 MONTH);
SELECT '1987-06-01' + INTERVAL 1 YEAR;
SELECT '1987-06-01' + INTERVAL 1 DAY; -- 정수X, 기간 표현이면 합연산으로도 가능

SELECT DAYOFWEEK('2022-07-14'); -- 1 = 일요일

SELECT EXTRACT(YEAR FROM '2022-07-14');
SELECT EXTRACT(MONTH FROM '2022-07-14');
SELECT EXTRACT(DAY FROM '2022-07-14');

SELECT DATEDIFF('2022-06-13', '2022-06-01');

SELECT STR_TO_DATE('2021/06/13', '%Y/%m/%d');
SELECT DATE_FORMAT(DATE '2021-06-13', '%Y-%m-%d');

-- 직원 테이블 (17일에 고용된 직원)
SELECT * FROM employees WHERE EXTRACT(DAY FROM HIRE_DATE) = 17;

SELECT * FROM employees WHERE HIRE_DATE LIKE '%-17';

-- job_history 각 행별로 일한 '기간'(일) 조회
SELECT START_DATE, END_DATE, DATEDIFF(END_DATE, START_DATE) AS inter FROM job_history ;

SELECT * FROM job_history;

-- 자료형 숫자, 문자열, 날짜
SELECT CAST(10 AS CHAR);
SELECT CAST('10' AS DOUBLE) + 5.5;

SELECT CONVERT(10, TIME); -- 타입에 대하여 파라미터로 받음
SELECT CONVERT('10', DOUBLE) + 5.5;
