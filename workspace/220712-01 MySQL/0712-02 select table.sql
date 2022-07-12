select * from country;

select * from city;

SELECT Name, Population From country; -- ;로 구분하므로 여러줄 작성 가능

desc country;

-- country 테이블 Code열과 gnp열을 조회해보세요.

select code, gnp from country; -- 호출 순서대로 출력됨

select * from country where Name = 'South Korea';-- where : 특정 조건을 가지는 행만보고 싶을 때

-- 국가명 'Japan', 'China' 조회
select * from country where Name = 'Japan';
select * from country where Name = "China";

-- Continent 값이 'Asia'인 행 조회하기
select * from country where Continent = 'Asia';





select * from country where Name = 'South Korea' OR Name = 'Japan' OR Name = 'China';

-- Population(인구) 컬럼 값이 40,000,000 이상인 국가의 모든 칼럼을 조회
select * from country where Population >= 40000000; -- 수치로도 조회가능
-- Population(인구) 컬럼 값이 40,000,000 이상이고 50,000,000 이하인 국가의 모든 컬럼을 조회
select * from country where Population >= 40000000 and Population <= 50000000;

-- Continent 'Asia'를 제외한 국가 목록 조회
SELECT * FROM COUNTRY WHERE CONTINENT <> 'ASIA';