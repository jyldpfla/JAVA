-- my_db 레스토랑, 메뉴랑 결합시킨 뷰 생성 후 조회
use my_db;

SELECT * FROM restaurant;
SELECT * FROM menu;

SELECT * FROM my_db.restmenu
WHERE name = "아임타이";

