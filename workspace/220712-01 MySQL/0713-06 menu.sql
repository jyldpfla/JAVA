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