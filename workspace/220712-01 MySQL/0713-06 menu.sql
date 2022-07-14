-- 식당 정보 테이블
-- 상호명
-- 전화번호
-- 주소 등
CREATE TABLE restaurant(
	ID INT PRIMARY KEY AUTO_INCREMENT
	, name VARCHAR(10) NOT NULL
    , number VARCHAR(20)
    , address VARCHAR(30) NOT NULL
);

SELECT * FROM restaurant;

INSERT INTO restaurant (name, number, address) VALUES ("아임타이", "0507-1362-1324", "부산 진구 전포대로 199번길 12");
INSERT INTO restaurant (name, number, address) VALUES ("각방", "0507-1435-0268", "부산 진구 동천로 107번길 12-5");
INSERT INTO restaurant (name, number, address) VALUES ("덴푸라야", "051-808-4412", "부산 진구 동천로 95번길");
INSERT INTO restaurant (name, number, address) 
VALUES ("플로레스타", "051-912-5713", "부산 진구 서전로 58번길 38"), ("근린문문", "0507-1438-1065","부산 진구 전포대로 210번길 36");


-- 메뉴 정보 테이블
-- 음식명
-- 가격 등
CREATE TABLE menu(
	ID INT PRIMARY KEY AUTO_INCREMENT
	, name VARCHAR(10) NOT NULL
    , price INT NOT NULL
);

INSERT INTO menu (name, price) VALUES ("팟타이", 10500), ("땡모반", 6000), ("파인애플 볶음밥", 11000), ("족발 덮밥", 12000);

SELECT * FROM menu;

ALTER TABLE menu ADD COLUMN restId INT;

UPDATE menu
SET restId = 2
WHERE Id <> 1;

ALTER TABLE menu ADD CONSTRAINT FOREIGN KEY (restID) REFERENCES restaurant (Id);

-- restaurants
-- name : VARCHAR(15)
-- phoneNumber : VARCHAR(14)
-- address : VARCHAR(100)

USE my_db;
CREATE TABLE restaurants (
	id INT PRIMARY KEY AUTO_INCREMENT
    , name VARCHAR(15) NOT NULL
    , phoneNumber VARCHAR(14) NOT NULL UNIQUE
    , address VARCHAR(100) NOT NULL UNIQUE
);

DESC restaurants;

INSERT INTO restaurants (name, phoneNumber, address)
	VALUES ('대모골', '1234-7890', '부전동 222-222')
		, ('영자면옥', '9874-6541', '부전동 111-111')
        , ('도연정', '4561-7561', '부전동 333-333');

SELECT * FROM restaurants;

-- menus
-- name : VARCHAR(15)
-- price : INT

CREATE TABLE menus (
	menuId INT PRIMARY KEY AUTO_INCREMENT
	, name VARCHAR(15) NOT NULL
    , price INT NOT NULL
);

INSERT INTO menus (name, price) VALUES ('고추장숯불정식', 8000), ('칼국수', 4000), ('짜장면', 3500);
INSERT INTO menus (name, price) VALUES ('칼국수', 3500);

SELECT * FROM menus;

ALTER TABLE menus ADD COLUMN restId INT;

UPDATE menus
SET restId = 2
WHERE menuId <> 1;

ALTER TABLE menus ADD CONSTRAINT FOREIGN KEY (restID) REFERENCES restaurants (id);






