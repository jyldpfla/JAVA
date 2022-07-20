-- 트랜잭션 이용하는 법
START TRANSACTION;

-- 작업하기
UPDATE books SET price = 50000;
UPDATE books SET price = 50000;

SELECT * FROM books;

ROLLBACK;
COMMIT;
--