/*
Link: https://leetcode.com/problems/sort-by/description/
2724. Sort By
*/

/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    return arr.sort((a,b) =>fn(a) - fn(b));
};