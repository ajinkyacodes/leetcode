# Link: https://leetcode.com/problems/second-highest-salary/description/
# 176. Second Highest Salary

# Write your MySQL query statement below
SELECT MAX(a.Salary) as SecondHighestSalary
FROM Employee a
JOIN Employee b ON a.Salary < b.Salary;