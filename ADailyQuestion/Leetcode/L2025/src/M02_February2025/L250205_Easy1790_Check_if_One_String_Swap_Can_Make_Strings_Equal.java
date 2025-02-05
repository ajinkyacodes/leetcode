package M02_February2025;
/*
Link: https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/
1790. Check if One String Swap Can Make Strings Equal
Topic: Hash Table, String
 */
public class L250205_Easy1790_Check_if_One_String_Swap_Can_Make_Strings_Equal {
    public static boolean areAlmostEqual(String s1, String s2) {
        int firstIndexDiff = 0;
        int secondIndexDiff = 0;
        int numDiffs = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                numDiffs++;
                // numDiffs is more than 2, one string swap will not make two strings equal
                if (numDiffs > 2) return false;
                else if (numDiffs == 1) {
                    // store the index of first difference
                    firstIndexDiff = i;
                } else {
                    // store the index of second difference
                    secondIndexDiff = i;
                }
            }
        }
        // check if swap is possible
        return (
                s1.charAt(firstIndexDiff) == s2.charAt(secondIndexDiff) &&
                        s1.charAt(secondIndexDiff) == s2.charAt(firstIndexDiff)
        );
    }
    // time = O(n)
    // space = O(1)

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank","kanb")); // true
        System.out.println(areAlmostEqual("attack","defend")); // false
        System.out.println(areAlmostEqual("kelb","kelb")); // true
    }
}
