-- 세션(Session) 변수(Variable)
-- 세션 : 1번의 접속동안은 유지되고 있는 범위 / 세션 변수 : 세션에서 사용되는 변수
SET @myVar := 10; -- @ 변수, := 대입연산자

SELECT @myVar * 10 + 5;
