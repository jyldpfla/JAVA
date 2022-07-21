CREATE TABLE persons_copy LIKE persons;
-- 테이블 만들때 like: like 뒤 모양처럼 만들어달라(column명 그대로 가져옴)

SELECT * FROM my_db.persons_copy;
SELECT * FROM persons;

INSERT INTO persons_copy (firstName, lastName, age, email) 
SELECT firstName, lastName, age, email FROM persons;

CREATE TABLE persons_copy2
SELECT * FROM persons;

DESC persons_copy2;

CREATE TEMPORARY TABLE mytable (
	myNum int
    , myStr VARCHAR(100)
);

SELECT * FROM mytable;
INSERT INTO mytable VALUES (1,'	a') -- 임시 테이블은 접속을 끊으면 사라짐