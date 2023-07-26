-- 코드를 입력하세요
SELECT i.INGREDIENT_TYPE, sum(f.TOTAL_ORDER) as TOTAL_ORDER from FIRST_HALF f 
inner join ICECREAM_INFO i on f.FLAVOR = i.flavor
group by i.INGREDIENT_TYPE
order by TOTAL_ORDER
