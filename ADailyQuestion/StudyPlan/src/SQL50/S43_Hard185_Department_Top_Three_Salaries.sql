# Link: https://leetcode.com/problems/department-top-three-salaries/description/
# 185. Department Top Three Salaries

# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
    JOIN Department d
    ON e.departmentId = d.id
WHERE 3 > (SELECT COUNT(DISTINCT(e2.Salary))
            FROM Employee e2
            WHERE e2.Salary > e.Salary
            AND e.DepartmentId = e2.DepartmentId
            );