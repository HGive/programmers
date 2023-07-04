-- 코드를 입력하세요
SELECT p.PRODUCT_CODE , sum((p.PRICE)*(o.SALES_AMOUNT)) as 'sales' from PRODUCT p 
inner join OFFLINE_SALE o on p.PRODUCT_ID = o.PRODUCT_ID
group by p.PRODUCT_CODE
order by sum((p.PRICE)*(o.SALES_AMOUNT)) desc , PRODUCT_CODE asc