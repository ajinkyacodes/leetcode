package M02_February2025;
/*
Link: https://leetcode.com/problems/find-unique-binary-string/description/
1980. Find Unique Binary String
 */
public class L250220_Medium1980_Find_Unique_Binary_String {
    // Approach: Cantor's Diagonal Argument
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            Character curr = nums[i].charAt(i);
            ans.append(curr == '0' ? '1' : '0');
        }

        return ans.toString();
    }
    // time = O(n)
    // space = O(1)
}
