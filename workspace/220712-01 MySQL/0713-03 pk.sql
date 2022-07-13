DROP DATABASE my_db;

CREATE DATABASE my_db;

USE my_db;

-- 고유한 자료 하나만 가리킬 수 있는 방법 -> 중복되지 않는 key
-- 주요 키 (PRIMARY KEY) : NOT NULL, UNIQUE
CREATE TABLE students (
	number INT PRIMARY KEY 
    -- 주요키, NULL값을 허용하지 않음(무조건 값이 있어야 함), 같은 값을 가지는 pk존재 불가(고유, 중복되지 x)
	, name VARCHAR(10)
    , age INT
    , score DOUBLE
);
-- 기본적으로 테이블 만들 때는 키 하나씩 존재해야 함

DESC students;

INSERT INTO students (number, name, age, score) VALUES (1234, '길동', 20, 3.3);
INSERT INTO students (number, name, age, score) VALUES (1235, '둘리', 30, 4.4);
INSERT INTO students (number, name, age, score) VALUES (1236, '길동', 30, 4.4);

SELECT * FROM students;

DROP TABLE students;