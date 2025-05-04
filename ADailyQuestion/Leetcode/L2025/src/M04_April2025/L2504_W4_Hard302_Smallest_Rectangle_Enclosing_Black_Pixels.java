package M04_April2025;
/*
Link: https://leetcode.com/problems/smallest-rectangle-enclosing-black-pixels/description/
302. Smallest Rectangle Enclosing Black Pixels
 */
public class L2504_W4_Hard302_Smallest_Rectangle_Enclosing_Black_Pixels {
    // Approach 2: DFS or BFS
    private int top, bottom, left, right;
    public int minArea(char[][] image, int x, int y) {
        if(image.length == 0 || image[0].length == 0) return 0;
        top = bottom = x;
        left = right = y;
        dfs(image, x, y);
        return (right - left) * (bottom - top);
    }
    private void dfs(char[][] image, int x, int y){
        if(x < 0 || y < 0 || x >= image.length || y >= image[0].length ||
                image[x][y] == '0')
            return;
        image[x][y] = '0'; // mark visited black pixel as white
        top = Math.min(top, x);
        bottom = Math.max(bottom, x + 1);
        left = Math.min(left, y);
        right = Math.max(right, y + 1);
        dfs(image, x + 1, y);
        dfs(image, x - 1, y);
        dfs(image, x, y - 1);
        dfs(image, x, y + 1);
    }
    // time = O(E)=O(B)=O(mn).
    // space = O(V)=O(B)=O(mn).
}
