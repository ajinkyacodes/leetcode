# Link: https://leetcode.com/problems/product-price-at-a-given-date/description/
# 1164. Product Price at a Given Date

# Write your MySQL query statement below
SELECT
  product_id,
  IFNULL (price, 10) AS price
FROM
  (
    SELECT DISTINCT
      product_id
    FROM
      Products
  ) AS UniqueProducts
  LEFT JOIN (
    SELECT DISTINCT
      product_id,
      FIRST_VALUE (new_price) OVER (
        PARTITION BY
          product_id
        ORDER BY
          change_date DESC
      ) AS price
    FROM
      Products
    WHERE
      change_date <= '2019-08-16'
  ) AS LastChangedPrice USING (product_id);