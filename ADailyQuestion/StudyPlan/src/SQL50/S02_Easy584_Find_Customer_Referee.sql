# Link: https://leetcode.com/problems/find-customer-referee/description/
# 584. Find Customer Referee

# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id != 2
OR referee_id IS null;