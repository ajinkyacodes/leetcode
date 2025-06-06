# Link: https://leetcode.com/problems/queries-quality-and-percentage/description/
# 1211. Queries Quality and Percentage

# Write your MySQL query statement below
SELECT query_name,
ROUND(AVG(CAST(rating AS DECIMAL) / position),2) AS quality,
ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) * 100 / COUNT(*),2) AS poor_query_percentage
FROM Queries
GROUP BY query_name;