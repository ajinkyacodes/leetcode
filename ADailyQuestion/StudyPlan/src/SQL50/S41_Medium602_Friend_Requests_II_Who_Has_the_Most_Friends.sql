# Link: https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/description/
# 602. Friend Requests II: Who Has the Most Friends

# Write your MySQL query statement below
SELECT id, COUNT(*) AS num
FROM (
    SELECT requester_id AS id FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id FROM RequestAccepted
) AS all_ids
GROUP BY id
ORDER BY num DESC
LIMIT 1;