-- 코드를 입력하세요
SELECT MCDP_CD as '진료과 코드' ,  count(*) as '5월예약건수' from APPOINTMENT 
where date_format(APNT_YMD, '%y-%m') like '22-05%'
group by MCDP_CD 
order by 2,1