/*
Link: https://leetcode.com/problems/apply-transform-over-each-element-in-array/description/
2635. Apply Transform Over Each Element in Array
*/

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const size = arr.length;
    for(let i=0; i<size; i++){
        arr[i] = fn(arr[i],i);
    }
    return arr;
};