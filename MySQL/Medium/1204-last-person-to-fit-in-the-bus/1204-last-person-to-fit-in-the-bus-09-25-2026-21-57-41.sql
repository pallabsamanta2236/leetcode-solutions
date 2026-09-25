# Write your MySQL query statement below
select person_name FROM(
select person_name ,
   sum(weight) over(order by turn) AS total_weight
   from Queue ) AS T
   where total_weight <= 1000
   order by total_weight DESC LIMIT 1;