select * from country where Name not In ('south korea', 'japan', 'china' );
-- 문자열 띄어쓰기까지 지켜야 함

select * from country where population not between 40000000 and 50000000;
-- between A and B : A와 B 사이의 값

-- Continent 컬럼 값이 North America, Europe, Asia를 제외한 국가들 중
-- GNP 값이 100에서 1000이하인 국가 목록 조회하기
select * from country where continent not in ('north america', 'europe', 'asia') and gnp between 100 and 1000;

select null;
select * from country where indepyear <> null;
-- 관계연산(산술연산도, 연산 모두)은 null을 하면 무조건 null 나옴
select * from country where indepyear is null;
