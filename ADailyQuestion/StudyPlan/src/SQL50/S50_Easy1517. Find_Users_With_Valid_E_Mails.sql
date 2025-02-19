# Link: https://leetcode.com/problems/find-users-with-valid-e-mails/description/
# 1517. Find Users With Valid E-Mails

# Write your MySQL query statement below
SELECT *
FROM Users
WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9_\.\-]*@leetcode(\\?com)?\\.com$';