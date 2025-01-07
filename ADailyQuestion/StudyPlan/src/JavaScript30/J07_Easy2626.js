/*
Link: https://leetcode.com/problems/array-reduce-transformation/description/
2626. Array Reduce Transformation
*/

/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let val = init;
    let n = nums.length;
    if(n==0) return init;
    for(let i=0; i<n; i++){
        val = fn(val, nums[i]);
    }
    return val;
};