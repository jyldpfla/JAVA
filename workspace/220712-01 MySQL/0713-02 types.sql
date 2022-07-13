-- 학생
-- 이름 : 가변길이문자열(10자)
-- 나이 : 정수
-- 학점 : 실수

-- 숫자 표현 : long, bigint 등도 존재

CREATE TABLE students (
	name VARCHAR(10)
    , age INT
    , score DOUBLE
);

INSERT INTO students (name, age, score) VALUES ('길동', 20, 3.3);
INSERT INTO students (name, age, score) VALUES ('둘리', 20.5, 3); -- 타입에 맞지 않는 숫자를 넣음
-- 정수형에 실수를 넣으면 반올림
-- double : 부동소수점 이용 -> 근사값 표현
INSERT INTO students (name, age, score) VALUES ('길동', 21, 2.6);

DELETE FROM students WHERE Name = '둘리'; -- 조건에 맞는 행만 삭제

SELECT * FROM students;







