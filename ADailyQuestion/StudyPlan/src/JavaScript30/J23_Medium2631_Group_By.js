/*
Link: https://leetcode.com/problems/group-by/description/
2631. Group By
*/

/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    return this.reduce((map, c) => {
        const id = fn(c);
        map[id] ? map[id].push(c) : (map[id] = [c]);
        return map;
    }, {});
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */