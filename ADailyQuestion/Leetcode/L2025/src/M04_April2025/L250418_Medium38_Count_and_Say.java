package M04_April2025;
/*
Link: https://leetcode.com/problems/count-and-say/description/
38. Count and Say
 */
public class L250418_Medium38_Count_and_Say {
    public String countAndSay(int n) {
        String currentString = "1";
        for (int i = 2; i <= n; i++) {
            String nextString = "";
            for (int j = 0, k = 0; j < currentString.length(); j = k) {
                while (
                        k < currentString.length() &&
                                currentString.charAt(k) == currentString.charAt(j)
                ) k++;
                nextString += Integer.toString(k - j) + currentString.charAt(j);
            }
            currentString = nextString;
        }
        return currentString;
    }
    // time = O(4 ^ n/3)
    // space = O(4 ^ n/3)
}
