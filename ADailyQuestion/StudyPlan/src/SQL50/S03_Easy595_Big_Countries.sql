# Link: https://leetcode.com/problems/big-countries/description/
# 595. Big Countries

# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
OR population >= 25000000;