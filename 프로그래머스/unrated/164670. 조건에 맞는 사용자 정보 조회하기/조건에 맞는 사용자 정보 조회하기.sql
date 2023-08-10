-- 코드를 입력하세요
SELECT b.WRITER_ID ,
u.NICKNAME,
concat_ws(' ',u.CITY , u.STREET_ADDRESS1 , u.STREET_ADDRESS2) as 전체주소 ,
CONCAT_WS('-', SUBSTRING(TLNO, 1, 3), SUBSTRING(TLNO, 4, 4), SUBSTRING(TLNO, 8, 4)) AS 전화번호
from USED_GOODS_BOARD b inner join USED_GOODS_USER u
on b.WRITER_ID = u.USER_ID
group by b.WRITER_ID 
having count(*)>=3
order by u.USER_ID desc