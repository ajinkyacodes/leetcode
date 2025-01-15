package Medium;
/*
Link: https://leetcode.com/problems/search-a-2d-matrix/description/
74. Search a 2D Matrix
 */
public class Medium74_Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    // TC = O(m*n)
    // SC = O(1)

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
}
