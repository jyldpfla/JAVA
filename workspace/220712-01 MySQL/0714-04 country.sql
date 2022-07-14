USE WORLD;

SELECT NAME
	, CASE WHEN LifeExpectancy IS NULL THEN 0.0 
    ELSE LifeExpectancy
    END AS LIFE 
    FROM country;

-- 직원 이름(이름 + 성) 결합시킨 Full Name
-- 전화번호가 011로 시작하는 경우, '개인전화', 그 외의 경우 '내선 번호'라고 별명은 '분류'조회
USE hr;
SELECT CONCAT(FIRST_NAME, ' ', LAST_NAME) AS 'FULL NAME'
	, CASE WHEN PHONE_NUMBER LIKE '011%' THEN '개인전화'
    ELSE '내선 번호'
    END AS '분류'
FROM EMPLOYEES;



SELECT CASE WHEN 10 > 5 THEN '10은 5보다 큽니다.'
			ELSE '왼쪽이 오른족보다 작거나 같습니다.'
            END;
            
SELECT CASE WHEN 10  > 5 THEN "왼쪽"
			WHEN 10 = 5 THEN "같음"
			WHEN 10 < 5 THEN "오른쪽"
			END AS "비교";
            
-- null을 대체해주는 함수
select ifnull(null, '두번째');
-- 첫번째가 null이면 두번째; 중첩하여 쓸 수 있음.

-- 헷갈리기 쉬운 함수**
select nullif('a', 'b');
-- a와 b가 같으면 null, 아니면 a 출력
            