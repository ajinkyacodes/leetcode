package Easy119;
/*
Link: https://leetcode.com/problems/pascals-triangle-ii/description/
FAANG Problem : Amazon
#119 - Pascal's Triangle II
 */
import java.util.ArrayList;
import java.util.List;
public class Easy119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1);
            row = newRow;
        }

        return row;
    }
    // TC = O(rowIndex^2)
    // SC = O(rowIndex)

    public static void main(String[] args) {
        int rowIndex=4;
        List<Integer> row = new ArrayList<>();
        row = getRow(rowIndex);
        for (int i = 0; i<=rowIndex; i++) {
            System.out.print(row.get(i)+" ");
        }
    }
}
