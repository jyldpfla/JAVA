SELECT CONCAT('asdf', "zzz"); -- 문자열 합치는 '함수'

SELECT hello("니이름");

CALL usp_countBooks;

CALL usp_findbytitle('asdf', @count);

SELECT @count;

CALL usp_selectTable('persons');

CALL usp_loop(10, @var);
SELECT @var;

CALL usp_loop(10);