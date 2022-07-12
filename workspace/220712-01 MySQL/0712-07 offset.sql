SELECT * FROM country;
-- SELECT * FROM country LIMIT 1 OFFSET 2; -- 2행 건너뛰기
-- SELECT * FROM country LIMIT 2, 1 -- 2개 1행 뛰어넘기

-- page 나누기.
SELECT * FROM country LIMIT 10 OFFSET 0;
SELECT * FROM country LIMIT 10 OFFSET 10;
SELECT * FROM country LIMIT 10 OFFSET 20;