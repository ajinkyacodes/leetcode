# Link: https://leetcode.com/problems/recyclable-and-low-fat-products/description/
# 1757. Recyclable and Low Fat Products

# Write your MySQL query statement below
Select product_id from Products
Where Products.low_fats = "Y" AND Products.recyclable = "Y";