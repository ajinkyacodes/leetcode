# Link: https://leetcode.com/problems/triangle-judgement/description/
# 610. Triangle Judgement

# Write your MySQL query statement below
SELECT x, y, z,
CASE WHEN x + y > z AND x + z > y AND y + z > x THEN 'Yes'
     ELSE 'No'
end AS triangle
FROM Triangle;