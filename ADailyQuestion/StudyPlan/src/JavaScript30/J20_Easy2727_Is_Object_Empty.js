/*
Link: https://leetcode.com/problems/is-object-empty/description/
2727. Is Object Empty
*/

/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    for (let key in obj)
        return false;
    return true;
};