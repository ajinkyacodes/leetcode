package Easy;
/*
Link: https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
1346. Check If N and Its Double Exist
 */
public class Easy1346_Check_If_N_and_Its_Double_Exist {
    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==(arr[j]*2) && i!=j) {
                    return true;
                }
            }
        }
        return false;
    }
    // TC = O(n^2)
    // SC = O(1)

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{10,2,5,3})); // true
        System.out.println(checkIfExist(new int[]{3,1,7,11})); // false
    }
}
