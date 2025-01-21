/*
Link: https://leetcode.com/problems/convert-object-to-json-string/description/
2633. Convert Object to JSON String

Approach: Using JSON-like String Concatenation
*/

/**
 * @param {null|boolean|number|string|Array|Object} object
 * @return {string}
 */
var jsonStringify = function(object) {
    if (object === null) {
    return 'null';
  }

  if (Array.isArray(object)) {
    const elements = object.map((element) => jsonStringify(element));
    return `[${elements.join(',')}]`;
  }

  if (typeof object === 'object') {
    const keys = Object.keys(object);
    const keyValuePairs = keys.map((key) => `"${key}":${jsonStringify(object[key])}`);
    return `{${keyValuePairs.join(',')}}`;
  }

  if (typeof object === 'string') {
    return `"${object}"`;
  }

  return String(object);
};