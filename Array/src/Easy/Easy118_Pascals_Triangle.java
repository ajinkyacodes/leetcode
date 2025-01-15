package Easy;
/*
Link: https://leetcode.com/problems/pascals-triangle/description/
118. Pascal's Triangle
FAANG Problem : Amazon
 */
import java.util.ArrayList;
import java.util.List;
public class Easy118_Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows<=0){
            return triangle;
        }
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    row.add(1);
                } else {
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
    // TC = O(numRows^2)
    // SC = O(numRows^2)

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle = generate(numRows);
        for(int i=0; i<numRows; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(triangle.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
