package M02_February2025;

import java.util.Stack;

/*
Link: https://www.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1
Histogram Max Rectangular Area
 */
public class G250225_Hard_Histogram_Max_Rectangular_Area {
    public static int getMaxArea(int heights[]) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
