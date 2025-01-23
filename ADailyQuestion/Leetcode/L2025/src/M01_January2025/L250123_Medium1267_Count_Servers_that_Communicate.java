package M01_January2025;
/*
Link: https://leetcode.com/problems/count-servers-that-communicate/description/
1267. Count Servers that Communicate
Topics: Matrix, Counting, DFS, BFS, Union Find
Solution Explained: https://youtu.be/piUHFC6KBq0

Approach: Matrix
 */
public class L250123_Medium1267_Count_Servers_that_Communicate {
    public static int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        int totalServers = 0;

        // Count the frequency of each row and column
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                if(grid[i][j]==1) {
                    rowCount[i]++;
                    colCount[j]++;
                    totalServers++;
                }
            }
        }

        // Check non-communicating servers
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                if(grid[i][j]==1 && rowCount[i]==1 && colCount[j]==1) {
                    totalServers--;
                }
            }
        }

        return totalServers++;
    }
    // Time = O(m * n)
    // Space = O(m + n)

    public static void main(String[] args) {
        System.out.println(countServers(new int[][]{{1,0},{0,1}})); // 0
        System.out.println(countServers(new int[][]{{1,0},{1,1}})); // 3
        System.out.println(countServers(new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}})); // 4
    }
}
