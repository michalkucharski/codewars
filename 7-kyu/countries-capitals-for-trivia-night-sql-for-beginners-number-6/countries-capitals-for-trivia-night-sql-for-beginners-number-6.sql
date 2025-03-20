-- Your solution here
select capital from countries where continent in ('Afrika', 'Africa') and country like 'E%' order by capital asc limit 3