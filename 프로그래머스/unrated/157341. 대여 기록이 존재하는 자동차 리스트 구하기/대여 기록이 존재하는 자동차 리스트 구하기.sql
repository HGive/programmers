-- 코드를 입력하세요
SELECT distinct c.CAR_ID from CAR_RENTAL_COMPANY_CAR c inner join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.CAR_ID = h.CAR_ID 
where c.car_type = '세단' and start_date like '%2022-10%'
order by c.CAR_ID desc