/*
Link: https://leetcode.com/problems/array-prototype-last/description/
2619. Array Prototype Last
*/

/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    // Check if the element is zero then return -1
    if(this.length == 0) {
        return -1;
    } else { // Else if there are 1 or more elements then simply return the element with index array length -1
        return this[this.length-1];
    }
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */