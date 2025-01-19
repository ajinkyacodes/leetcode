package GFGWeekly190;

public class Longest_Substring {
    public static  String findSubstring(String s) {
        // Step 1: Count character frequencies
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Build the "half part" and identify the center character
        StringBuilder half = new StringBuilder();
        char center = '\0'; // Center character (if any)

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            int count = freq[i];
            if (count % 2 != 0) {
                if (center == '\0') {
                    center = c; // First odd character becomes the center
                }
                count--; // Reduce odd frequency by 1
            }
            // Add half of the remaining count to the "half part"
            for (int j = 0; j < count / 2; j++) {
                half.append(c);
            }
        }

        // Step 3: Form the palindrome
        String halfStr = half.toString();
        StringBuilder palindrome = new StringBuilder(halfStr);
        if (center != '\0') {
            palindrome.append(center); // Add center character (if any)
        }
        palindrome.append(new StringBuilder(halfStr).reverse()); // Add reversed "half part"

        return palindrome.toString();
    }

    public static void main(String[] args) {
        // Example Test Cases
        String s1 = "abaccd";
        System.out.println(findSubstring(s1)); // Output: "acbca"

        String s2 = "aaaabbbb";
        System.out.println(findSubstring(s2)); // Output: "abbaabba"

        String s3 = "a";
        System.out.println(findSubstring(s3)); // Output: "a"

        String s4 = "xyz";
        System.out.println(findSubstring(s4)); // Output: "x" (or "y" or "z")
    }
}
