package M01_January2025;
/*
Link: https://www.geeksforgeeks.org/problems/n-queen-problem0315/1
N-Queen Problem
Topic: Backtracking
 */
import java.util.*;
public class G250130_Hard_N_Queen_Problem {
    public static ArrayList<ArrayList<Integer>> nQueen(int n) {
        if (n < 4 && n != 1) return new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int[] row = new int[n];
        solve(0, 0, 0, 0, n, row, res);
        return res;
    }
    // time = O(n!)
    // space = O(n)

    private static void solve(int c, int cols, int d1, int d2, int n, int[] row, ArrayList<ArrayList<Integer>> res) {
        if (c == n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int r : row) temp.add(r + 1);
            res.add(temp);
            return;
        }
        for (int r = 0, pos = 1; r < n; ++r, pos <<= 1)
            if ((cols & pos) == 0 && (d1 & (pos << c)) == 0 && (d2 & (pos << (n - 1 - c))) == 0) {
                row[c] = r;
                solve(c + 1, cols | pos, d1 | (pos << c), d2 | (pos << (n - 1 - c)), n, row, res);
            }
    }

    public static void main(String[] args) {
        System.out.println(nQueen(1)); // [1]
        System.out.println(nQueen(4)); // [[2 4 1 3 ] [3 1 4 2 ]]
        System.out.println(nQueen(2)); // []
    }
}
