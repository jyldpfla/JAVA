SELECT * FROM employees;

SELECT RTRIM('A               ');
SELECT LTRIM('               A');
SELECT TRIM('        A        ');

SELECT LOWER('ABCDE');
SELECT UPPER('abcde');

SELECT REVERSE ('qwer');

SELECT CONCAT('문자열', '결합', '함수');
SELECT CONCAT("결합", NULL, "값이 있으면?");

SELECT CHAR_LENGTH('문자열길이');

SELECT REPLACE('원본 문자열에서 변환합니다', '변환', 'REPLACE'); 

SELECT SUBSTRING('employees', 5); -- 문자열, 자를 시작 위치
SELECT SUBSTRING('employees', 5, 2); -- 문자열, 자를 시작 위치, 개수
SELECT SUBSTRING('employees', -3); -- 음수일 때 우측에서부터 위치를 세어나감
SELECT SUBSTRING('employees', -3, 2);

SELECT LPAD("123", 5, "0"); 
-- LPAD(문자열, 길이, 문자) : 문자열 왼쪽에 문자를 채워 길이를 맞춰줌
SELECT RPAD("456", 5, "*");
SELECT REPEAT("반복결합", 3);

SELECT LOCATE('D', 'ABCDEFG');
SELECT LOCATE('위치', '문자열의 위치를 찾는데 SQL의 문자 순서는 1부터임');
SELECT LOCATE('A', 'ABABAB', 2);

-- "515.123.4567"
-- .을 기준으로 잘라보셈
SELECT SUBSTRING("515.123.4567", 1, LOCATE('.', "515.123.4567"));
SELECT SUBSTRING("515.123.4567", 1, 3);
SELECT SUBSTRING("515.123.4567", 4,LOCATE('.', "515.123.4567"));
SELECT SUBSTRING("515.123.4567", -4, LOCATE('.', "515.123.4567"));

-- 직원 테이블 전화번호 앞자리 3자리로 그룹지어 개수
SELECT SUBSTRING(PHONE_NUMBER, 1, 3), COUNT(*) FROM employees GROUP BY SUBSTRING(PHONE_NUMBER, 1, 3);

-- 
SELECT RAND(); -- 랜덤 수a
SELECT ROUND(123.123, 2);
SELECT FLOOR(1.555); -- 내림
SELECT CEIL(1.222); -- 올림

SELECT ABS(-55);
SELECT POW(2, 8);

SELECT PI();

-- 주사위 1~6 사이의 난수 생성
SELECT CEIL(RAND() * 6);