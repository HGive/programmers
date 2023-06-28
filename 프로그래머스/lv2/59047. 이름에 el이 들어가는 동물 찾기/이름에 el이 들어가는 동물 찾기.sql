-- 코드를 입력하세요
SELECT ANIMAL_ID, name from ANIMAL_INS 
where ANIMAL_TYPE='dog' and lower(name) like '%el%'
order by name