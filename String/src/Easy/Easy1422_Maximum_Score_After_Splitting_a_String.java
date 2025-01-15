package Easy;
/*
Link : https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/
1422. Maximum Score After Splitting a String
Topics: String, PrefixSum
Solution: https://www.youtube.com/watch?v=1CVKhF53Utw
 */
public class Easy1422_Maximum_Score_After_Splitting_a_String {
    public static int maxScore(String s) {
        int n = s.length();
        int maxScore = 0;
        int zeroCount = 0;
        int oneCount = 0;

        // Counting number of onces
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1'){
                oneCount++;
            }
        }

        // Calculating Max Score
        for(int i=0; i<n-1; i++) {
            if(s.charAt(i)=='0'){
                zeroCount++;
            } else {
                oneCount--;
            }
            if((zeroCount+oneCount) > maxScore){
                maxScore = zeroCount+oneCount;
            }
        }

        return maxScore;
    }
    // TC = O(N)
    // SC = O(1)

    public static void main(String[] args) {
        String s = "011101"; // 5
        System.out.println(maxScore(s));
    }
}
