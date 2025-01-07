/*
Link: https://leetcode.com/problems/counter/description/
2620. Counter
*/

/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {

    let count = n;
    return function() {
        return count++;
    };
};

/**
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */