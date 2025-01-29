package M01_January2025;
/*
Link:
1427. Perform String Shifts
Topic: Array, Math, String
 */
public class L2501_W1_Easy1427_Perform_String_Shifts {
    public static String stringShift(String s, int[][] shift) {
        // Count the number of left shifts. A right shift is a negative left shift.
        int leftShifts = 0;
        for (int[] move : shift) {
            if (move[0] == 1) {
                move[1] = -move[1];
            }
            leftShifts += move[1];
        }

        // Convert back to a positive, do left shifts, and return.
        leftShifts = Math.floorMod(leftShifts, s.length());
        s = s.substring(leftShifts) + s.substring(0, leftShifts);
        return s;
    }
    // time = O(N+L)
    // space = O(L)

    public static void main(String[] args) {
        String s1 = "abc";
        int[][] shift1 = {{0,1},{1,2}};
        System.out.println(stringShift(s1, shift1)); // "cab"

        String s2 = "abcdefg";
        int[][] shift2 = {{1,1},{1,1},{0,2},{1,3}};
        System.out.println(stringShift(s2, shift2)); // "efgabcd"
    }
}
