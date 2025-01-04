package Medium;
/*
Link: https://leetcode.com/problems/rotate-image/description/
48. Rotate Image
 */
public class Medium48 {
    public static void rotateMatrix(int[][] matrix) {
        int N = matrix.length;
        int temp;

        // Transpose Matrix And Swap [i][j] to [j][i]
        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Flip Matrix Horizontally
        for(int i=0; i<N; i++){
            for(int j=0; j<N/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-j-1];
                matrix[i][N-j-1] = temp;
            }
        }

        // Printing Matrix (Optional)
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    // TC = O(N^2)
    // SC =  O(1)

    public static void main(String[] args) {
        int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(myArray);
    }
}
