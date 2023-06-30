-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME,
Case
when SEX_UPON_INTAKE like 'Spayed%' or SEX_UPON_INTAKE like 'Neutered%' then 'O'
else 'X'
end
from ANIMAL_INS 
order by ANIMAL_ID