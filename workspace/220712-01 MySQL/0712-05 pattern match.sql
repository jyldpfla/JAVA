SELECT * FROM country
WHERE Name LIKE '%Korea%'; -- 띄어쓰기 제대로 안되면 안먹어줌

SELECT * FROM country
WHERE Name LIKE '%K%'; -- K 포함

SELECT * FROM country
WHERE Name LIKE '%K'; -- K로 시작하는

SELECT * FROM country
WHERE Name LIKE '%K'; -- K로 끝나는

-- 국가명이 'A'로 시작하고 'A'로 끝나는 국가 조회
SELECT * FROM country
WHERE NAME LIKE 'A%A';

-- 국가명이 'A'로 시작하고 'A'로 끝나는 국가 조회 (6자)
SELECT * FROM country
WHERE NAME LIKE 'A____A'; -- _(underscore)는 1글자

-- 국가명이 ~ria로 끝나는 국가 조회
SELECT * FROM country
WHERE NAME LIKE '%RIA';

-- REGION 컬럼이 North~~로 시작하는 국가 조회
SELECT * FROM country
WHERE REGION LIKE 'North%';

-- REGION 컬럼에 A로 시작해서 a로 끝나는 명칭을 포함하지 않는 국가
SELECT * FROM country
WHERE Region NOT LIKE '%a%a' AND WHERE Region NOT LIKE 'a%a%'; 
