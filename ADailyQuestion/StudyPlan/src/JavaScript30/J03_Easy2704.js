/*
Link: https://leetcode.com/problems/to-be-or-not-to-be/description/
2704. To Be Or Not To Be
*/

/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    const originalVal = val;
    return {
        toBe: function(newVal){
            if(newVal!==originalVal){
                throw new Error("Not Equal");
            } else return true;

        },
        notToBe: function(newVal){
            if(newVal===originalVal){
                throw new Error("Equal");
            } else return true;
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */