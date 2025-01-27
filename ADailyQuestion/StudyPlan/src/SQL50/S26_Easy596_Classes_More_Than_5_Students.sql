# Link: https://leetcode.com/problems/classes-more-than-5-students/description/
# 596. Classes More Than 5 Students

# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;