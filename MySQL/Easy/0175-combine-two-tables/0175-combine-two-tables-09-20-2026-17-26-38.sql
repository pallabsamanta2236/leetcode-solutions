# Write your MySQL query statement below
SELECT P.firstName , P.lastName,A.city,A.state 
from  Person P  left join Address A On P.personId = A.personId;