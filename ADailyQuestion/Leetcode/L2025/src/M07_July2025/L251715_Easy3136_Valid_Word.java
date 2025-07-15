package M07_July2025;
/*
Link: https://leetcode.com/problems/valid-word/description/
3136. Valid Word
 */
public class L251715_Easy3136_Valid_Word {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                char ch = Character.toLowerCase(c);
                if (
                        ch == 'a' ||
                                ch == 'e' ||
                                ch == 'i' ||
                                ch == 'o' ||
                                ch == 'u'
                ) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return hasVowel && hasConsonant;
    }
    // time = O(n).
    // space = O(1).
}
