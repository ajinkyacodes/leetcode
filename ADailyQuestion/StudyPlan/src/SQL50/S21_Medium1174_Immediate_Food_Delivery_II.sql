# Link: https://leetcode.com/problems/immediate-food-delivery-ii/description/
# 1174. Immediate Food Delivery II

# Write your MySQL query statement below
SELECT round(avg(order_date = customer_pref_delivery_date)*100, 2) AS immediate_percentage
FROM Delivery
WHERE (customer_id, order_date) IN (
  SELECT customer_id, min(order_date)
  FROM Delivery
  GROUP BY customer_id
);