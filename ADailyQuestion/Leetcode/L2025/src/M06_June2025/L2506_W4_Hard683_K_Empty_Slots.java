package M06_June2025;
/*
Link: https://leetcode.com/problems/k-empty-slots/description/
683. K Empty Slots
 */
public class L2506_W4_Hard683_K_Empty_Slots {
    /*
    public int kEmptySlots(int[] flowers, int k) {
        TreeSet<Integer> active = new TreeSet();
        int day = 0;
        for (int flower: flowers) {
            day++;
            active.add(flower);
            Integer lower = active.lower(flower);
            Integer higher = active.higher(flower);
            if (lower != null && flower - lower - 1 == k ||
                    higher != null && higher - flower - 1 == k)
                return day;
        }
        return -1;
    }
    */
    // time = O(NlogN)
    // space = O(N)
}
