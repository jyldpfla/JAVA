CREATE TABLE books (
	bookId INT PRIMARY KEY AUTO_INCREMENT
    , title VARCHAR(30)
    , price INT
);

DESC books;

INSERT INTO books (title, price) VALUES ("책1", 2000), ("책2", 3000), ("중복이름", 2500), ("중복이름", 3000);

SELECT * FROM books;
DELETE FROM books WHERE bookId = 3;

INSERT INTO books (title, price) VALUES ("새로운이름", 3500);
-- ID값은 고유 + AUTO_INCREMENT 때문에 자동으로 값이 늘어나서 앞에 지워져도 거기로 들어가지 x



