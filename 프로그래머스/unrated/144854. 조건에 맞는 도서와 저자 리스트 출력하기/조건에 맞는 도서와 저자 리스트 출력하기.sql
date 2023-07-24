-- 코드를 입력하세요
SELECT BOOK_ID, a.AUTHOR_NAME, date_format(PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE from book b
inner join AUTHOR a on a.AUTHOR_ID= b.AUTHOR_ID
where category = '경제'
order by PUBLISHED_DATE