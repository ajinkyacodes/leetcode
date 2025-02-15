# Link: https://leetcode.com/problems/patients-with-a-condition/description/
# 1527. Patients With a Condition

# Write your MySQL query statement below
SELECT * FROM PATIENTS WHERE
CONDITIONS LIKE '% DIAB1%' OR
CONDITIONS LIKE 'DIAB1%';