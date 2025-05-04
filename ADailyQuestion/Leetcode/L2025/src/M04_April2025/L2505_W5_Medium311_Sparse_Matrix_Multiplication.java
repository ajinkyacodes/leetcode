package M04_April2025;
/*
Link: https://leetcode.com/problems/sparse-matrix-multiplication/description/
311. Sparse Matrix Multiplication
 */
public class L2505_W5_Medium311_Sparse_Matrix_Multiplication {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        int k = mat1[0].length;
        int m = mat2[0].length;

        // Product matrix will have 'n x m' size.
        int[][] ans = new int[n][m];

        for (int rowIndex = 0; rowIndex < n; ++rowIndex) {
            for (int elementIndex = 0; elementIndex < k; ++elementIndex) {
                // If current element of mat1 is non-zero then iterate over all columns of mat2.
                if (mat1[rowIndex][elementIndex] != 0)  {
                    for (int colIndex = 0; colIndex < m; ++colIndex) {
                        ans[rowIndex][colIndex] += mat1[rowIndex][elementIndex] * mat2[elementIndex][colIndex];
                    }
                }
            }
        }

        return ans;
    }
    // time = O(m⋅k⋅n).
    // space = O(1).
}
