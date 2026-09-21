# Write your MySQL query statement below
select activity_date AS day, 
count(DISTINCT user_id)AS active_users
FROM Activity where activity_date BETWEEN '2019-06-28' and '2019-07-27'
group by activity_date;
