package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/print-anagrams-together/1
Print Anagrams Together
Topics: String, Hash
Solution: https://www.youtube.com/watch?v=EpztAdNy-wc
 */
import java.util.*;
public class G250101_Medium {
    public static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        Map<String, List<String>> map = new HashMap();

        for(String s: arr){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortWord = String.valueOf(ch);

            if(!map.containsKey(sortWord)){
                map.put(sortWord, new ArrayList());
            }
            map.get(sortWord).add(s);
            //System.out.println(map.get(sortWord));
        }
        return new ArrayList(map.values());
    }
    // TC = O(N * M Log M)
    // SC = O(N)
    /*
        The overall time complexity is O(n * m log m), where `n` is the number of strings in the input array and `m` is the average length of the strings.
        Overall, the space complexity is O(n) for the map and the output combined. Thus, the final space complexity is O(n).
    */

    public static void main(String[] args) {
        String[] strs = {"act", "god", "cat", "dog", "tac"};
        ArrayList<ArrayList<String>> result = anagrams(strs);
        System.out.println("Groups of anagrams: " + result);
    }
}
