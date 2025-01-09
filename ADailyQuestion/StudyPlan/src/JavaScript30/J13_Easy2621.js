/*
Link: https://leetcode.com/problems/sleep/description/
2621. Sleep
*/

/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    await new Promise(resolve => setTimeout(resolve, millis));
}

// Testing the function call
 let t = Date.now()
 sleep(100).then(() => console.log(Date.now() - t)) // 100

