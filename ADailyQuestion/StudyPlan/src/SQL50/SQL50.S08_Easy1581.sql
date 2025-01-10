# Link: https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/description/
# 1581. Customer Who Visited but Did Not Make Any Transactions

# Write your MySQL query statement below
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id;