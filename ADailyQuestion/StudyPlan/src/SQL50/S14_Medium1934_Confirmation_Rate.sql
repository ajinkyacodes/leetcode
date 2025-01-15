# Link: https://leetcode.com/problems/confirmation-rate/description/
# 1934. Confirmation Rate

# Write your MySQL query statement below
SELECT s.user_id, ROUND(AVG(IF(c.action="confirmed",1,0)),2) as confirmation_rate
FROM Signups s LEFT JOIN Confirmations c
ON s.user_id = c.user_id
GROUP By s.user_id
ORDER By s.user_id;