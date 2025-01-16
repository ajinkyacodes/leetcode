# Link: https://leetcode.com/problems/not-boring-movies/description/
# 620. Not Boring Movies

# Write your MySQL query statement below
SELECT * FROM Cinema
WHERE id % 2 !=0 AND description != "boring"
ORDER BY rating DESC;