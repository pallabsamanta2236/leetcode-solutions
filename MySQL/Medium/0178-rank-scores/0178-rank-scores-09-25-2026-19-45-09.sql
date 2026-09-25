# Write your MySQL query statement below
SELECT score ,
# here RANK()IS A WINDOW FUNCTION KEYWORD IS PRESENT IF I DO ONLY rank here is run the window function but if 'rank' i do this it perticularly explain the coloum name,,,so here we use '' here
DENSE_RANK() OVER( ORDER BY score DESC) AS 'rank'
FROM Scores
ORDER BY score DESC;