CREATE DATABASE my_db;

SHOW DATABASES;

USE my_db;

SHOW TABLES;

-- 테이블은 '열'(이름을 가지고, 특정한 값이 들어감)을 가짐
-- 사람 테이블
-- 열 1 이름(문자열)
-- 열 2 나이 (정수)

CREATE TABLE persons ( -- 테이블명은 고유해야 함
	name VARCHAR(10),
    age INT
);

DESC persons; -- 테이블 보기

SELECT * FROM persons; 

INSERT INTO persons (name, age) VALUES ("홍길동", 22); -- 테이블에 하나의 행 넣기(열 순서대로 정보 기입)

-- '브루스 리', 30살
INSERT INTO persons (name, age) VALUES ("브루스 리", 30);
-- '스티븐 킹', 40살
INSERT INTO persons (name, age) VALUES ("스티븐 킹", 40);  -- 앞의 열 순서대로만 행 정보 추가해주면 값 제대로 들어감

-- '철수', 20살
-- '철수', 30살
-- '철수', 40살
INSERT INTO persons (name, age) VALUES ('철수', 20), ('철수', 30), ('철수', 40); -- 여러줄의 행 넣기

DELETE FROM persons; -- 테이블의 모든 행 삭제

DROP TABLE persons; -- 테이블 삭제

-- 책 테이블 생성
-- 제목 : 문자열
-- 가격 : 정수
CREATE TABLE books(title VARCHAR(25), price INT);

-- 파워자바, 25000
-- 하늘과 바람과 별과 시, 15000
-- 꽃을 보듯 너를 본다, 12000
INSERT INTO books(title, price) VALUES ('파워자바', 25000), ('하늘과 바람과 별과 시', 15000), ('꽃을 보듯 너를 본다', 12000);

SELECT * FROM books;
DROP TABLE books;

CHAR(); -- 문자열을 나타내는 타입1, ()은 문자열의 길이 제한
-- 고정된 길이 값을 가짐 - 문자열길이에 맞춰지도록 값이 작아도 공백(빈칸)으로 그 값을 채워서 문자열길이를 맞춤
VARCHAR(); -- 문자열을 나타내는 타입2, ()은 문자열의 길이 제한
-- 가변 길이값을 가짐 - 문자열길이보다 모자라도, 그에 맞게 길이값이 조정됨

CREATE TABLE testChar (fixLength CHAR(5), varLength VARCHAR(5));

INSERT INTO testChar (fixLength, varLength) VALUES ('A','A');

SELECT * FROM testChar;

SELECT char_length(fixLength), char_length(varLength) FROM testChar; -- char가 비효율적 공간사용으로 최적화돼있으면 공간 1로 잡힘

SELECT RTRIM('A                 '); -- 우측 공백 제거
SELECT LTRIM('                 A'); -- 좌측 공백 제거