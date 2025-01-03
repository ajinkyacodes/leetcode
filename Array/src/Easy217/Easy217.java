package Easy217;
/*
Link: https://leetcode.com/problems/contains-duplicate/description/
#217 - IsUnique / Contains Duplicate
 */
public class Easy217 {
    public static boolean isUnique(int[] intArray) {
        // TODO
        for(int i=0; i<intArray.length; i++){
            for(int j=i+1; j<intArray.length; j++){
                if(intArray[i]==intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
    // TC = O(NLogN)
    // SC = O(LogN)

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        System.out.println(isUnique(intArray));
    }
}
