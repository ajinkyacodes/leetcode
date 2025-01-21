/*
Link: https://leetcode.com/problems/curry/description/
2632. Curry

Approach: Currying with Recursive Function Calls
*/

/**
 * @param {Function} fn
 * @return {Function}
 */
var curry = function(fn) {

    return function curried(...args) {
        if(args.length >= fn.length) {
         return fn(...args);
      }

      return (...nextArgs) => curried(...args, ...nextArgs);
    }
};

/**
 * function sum(a, b) { return a + b; }
 * const csum = curry(sum);
 * csum(1)(2) // 3
 */
