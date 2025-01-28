# Link: https://leetcode.com/problems/find-followers-count/description/
# 1729. Find Followers Count

# Write your MySQL query statement below
SELECT user_id, count(*) as followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id;