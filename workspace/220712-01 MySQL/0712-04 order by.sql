select code as "코드", name as "이름", population as "인구" from country;

-- 위의 조회 + SurfaceArea(별명 면적) 컬럼을 추가로 조회
select code as "코드", name as "이름", population as "인구", surfacearea as "면적" from country;
-- round(값, 소수점자리수) : 반올림

-- SurfaceArea가 50,000이하이면서 Population이 10,000,000 이상인 국가의 인구밀도를 조회하세요.
select code as "코드", name as "이름", population as "인구", surfacearea as "면적", Round( Population / SurfaceArea, 1 ) as "인구밀도" from country
where surfacearea <= 50000 and population >= 10000000;
-- 조건에서 별명 불가
-- round(값, 소수점자리수) : 반올림

-- 정렬 -> 별명도 가능
select code as "코드", name as "이름", population as "인구", surfacearea as "면적" from country order by 인구 ASC;
-- ASC : 오름차순(생략 가능) / DESC : 내림차순

-- 아시아 대륙 국가들의 인구 순으로(내림차순) 조회
select * from country where continent = 'asia' order by population desc;

-- LifeExpectancy 오름차순으로 조회 (null값 제외한 행)
select * from country where LifeExpectancy is not null order by LifeExpectancy ASC;
-- null값이 제일 위에 위치

-- 국가의 이름과 인구와 GNP, GNPOld를 조회하고(GNPOld - GNP 차를 구해서 "변화량") 조회
 select name, population, gnp, gnpold, GNPOld - gnp as "GNP 변화량"
 from country where gnp is not null and gnpold is not null order by `GNP 변화량`;
 -- 컬럼, 객체명 등 별명에 띄어쓰기 있을 때는 `(~)로 해결
 
 -- 대륙 순으로 정렬해서 조회
 select * from country ORDER BY Continent, Population;
 -- 1차적 기준으로 동일한 값을 가지는 행들끼리 2차적 기준으로 새롭게 정렬
 
 -- governmentform 오름차순 정렬, GNP 내림차순으로 정렬
 SELECT * FROM Country ORDER BY GovernmentForm, GNP DESC;