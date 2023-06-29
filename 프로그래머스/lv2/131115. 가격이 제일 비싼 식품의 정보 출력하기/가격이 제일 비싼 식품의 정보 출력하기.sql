-- 코드를 입력하세요
SELECT * from FOOD_PRODUCT
where Price >= (select max(price) from food_product )