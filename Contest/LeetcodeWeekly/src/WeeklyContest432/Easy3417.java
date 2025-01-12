package WeeklyContest432;
/*
Link: https://leetcode.com/problems/zigzag-grid-traversal-with-skip/description/
3417. Zigzag Grid Traversal With Skip
Topics: Grid
 */
import java.util.*;
public class Easy3417 {
    public static List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int m = grid.length;
        if(m==0) return result;
        int n = grid[0].length;

        boolean leftToRight = true;

        for(int i = 0; i<m; i++) {
            if(leftToRight) {
                for(int j=0; j<n; j++) {
                    if((i+j)%2 == 0) {
                        result.add(grid[i][j]);
                    }
                }
            } else {
                for(int j=n-1; j>=0; j--) {
                    if((i+j)%2 == 0) {
                        result.add(grid[i][j]);
                    }
                }
            }
            leftToRight = !leftToRight;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2},{3,4}};
        List<Integer> result = zigzagTraversal(grid);
        for(int i=0; i<result.size(); i++) {
            System.out.println(result.get(i)+" "); // [1,4]
        }
    }
}
