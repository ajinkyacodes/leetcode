# Link: https://leetcode.com/problems/biggest-single-number/description/
# 619. Biggest Single Number

# Write your MySQL query statement below
SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS unique_numbers;
