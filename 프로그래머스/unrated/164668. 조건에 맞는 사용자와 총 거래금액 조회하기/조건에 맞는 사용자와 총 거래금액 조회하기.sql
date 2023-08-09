-- 코드를 입력하세요
SELECT uu.USER_ID, uu.NICKnaME, sum(PRICE) from USED_GOODS_BOARD ub inner join USED_GOODS_USER uu 
on ub.WRITER_ID = uu.USER_ID
where STATUS = 'done'
group by uu.USER_ID
having sum(PRICE)>=700000
order by sum(PRICE)
