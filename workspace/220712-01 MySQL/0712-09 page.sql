-- SET @rowCount := 239;
-- ##에 임의의 입력 하시면 됩니다.
 SET @rowCount := 239;
 SET @pageNumber := 1;
 SET @pagePer := 10;
 SET @totalPage := @pageNumber * @pagePer; -- 총페이지 수(계산 수식 작성)

-- 239행을 가지는 country 테이블을 각 페이지별 행의 개수와 보고자 하는 페이지 번호를 정하면
-- 해당 row들을 조회할 수 있는 SELECT 문을 작성해보기

SELECT * FROM country LIMIT 10 OFFSET 0;
-- SELECT * FROM country LIMIT 10 OFFSET 10;

-- PREPARE STMT FROM 'SELECT * FROM county LIMIT ?';
-- EXECUTE STMT USING @pagePer; 



