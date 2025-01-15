package Medium;
/*
Link : https://leetcode.com/problems/construct-k-palindrome-strings/description/
1400. Construct K Palindrome Strings
Topics: Hash Table, String, Greedy, Counting
 */
import java.util.HashMap;

public class Medium1400_Construct_K_Palindrome_Strings {
    public static boolean canConstruct(String s, int k) {
        int n = s.length();
        int odd = 0;

        if(n<k) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i: map.values()) {
            if(i%2 !=0) odd++;
        }

        //System.out.println(map);
        //System.out.println("odd = "+odd+" and k = "+k);

        return odd<=k;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        String s = "annabelle";
        int k = 2;
        System.out.println(canConstruct(s, k)); // true
    }
}
