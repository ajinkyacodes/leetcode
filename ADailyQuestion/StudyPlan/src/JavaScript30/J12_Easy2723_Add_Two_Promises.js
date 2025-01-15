/*
Link: https://leetcode.com/problems/add-two-promises/description/
2723. Add Two Promises
*/

/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    return Promise.all([promise1, promise2])
    .then(([result1, result2]) => result1 + result2);
};

// Example Test Case
addTwoPromises(Promise.resolve(10), Promise.resolve(-12)).then(console.log); // -2
