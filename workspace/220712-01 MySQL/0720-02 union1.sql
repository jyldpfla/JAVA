SELECT 1, 2, 3 -- 테이블, 3개의 COULUMN 가짐
UNION  -- 테이블을 세로로 이어줌
SELECT 4, 5, 6
UNION -- 중복 행은 distinct처럼 사라짐
SELECT 7, 8, 9
UNION ALL -- 중복을 신경쓰지 않고 붙여줌
SELECT 1, 2, 3; 