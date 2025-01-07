/*
Link: https://leetcode.com/problems/counter-ii/description/
2665. Counter II
*/

/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let present = init;
    return {
        increment: () => ++present,
        decrement: () => --present,
        reset: () => present=init,
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */