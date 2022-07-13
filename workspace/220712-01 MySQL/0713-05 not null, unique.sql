CREATE TABLE persons (
	personalId INT PRIMARY KEY AUTO_INCREMENT
	-- 이름
    , firstName VARCHAR(10) NOT NULL -- NULL값 허용 X
    -- 성
    , lastName VARCHAR(10) NOT NULL
    -- 나이
    , age INT NOT NULL
    , email VARCHAR(50) NOT NULL UNIQUE -- 중복 X
);

INSERT INTO persons (firstName, lastName, age, email) 
	VALUES ("길동", "홍", 20, "길동@길동.net");
INSERT INTO persons (firstName, lastName, age, email) 
	VALUES ("길동", "고", 42, "kildong@길동.net");
    
SELECT * FROM persons;

-- 테이블 이름
-- 각 열 (이름, 타입, 제약)
-- Key 열 
    
