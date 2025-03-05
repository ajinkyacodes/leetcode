package M03_March2025;
/*
Link:
2579. Count Total Number of Colored Cells
 */
public class L250305_Medium2579_Count_Total_Number_of_Colored_Cells {
    // Approach: Iterative Addition
    public long coloredCells(int n) {
        long numBlueCells = 1;
        int addend = 4;

        // Iterate n - 1 times
        while (--n > 0) {
            // Add and update current multiple of 4
            numBlueCells += addend;
            addend += 4;
        }
        return numBlueCells;
    }
    // time = O(n)
    // space = O(1)
}
