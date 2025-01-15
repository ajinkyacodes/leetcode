# Link: https://leetcode.com/problems/invalid-tweets/description/
# 1683. Invalid Tweets

# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE Length(content) > 15;