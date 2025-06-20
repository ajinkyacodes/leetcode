package M06_June2025;
/*
Link: 3443. Maximum Manhattan Distance After K Changes
3443. Maximum Manhattan Distance After K Changes
 */
public class L250620_Medium3443_Maximum_Manhattan_Distance_After_K_Changes {
    public int maxDistance(String s, int k) {
        int ans = 0;
        int north = 0, south = 0, east = 0, west = 0;
        for (char it : s.toCharArray()) {
            switch (it) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    south++;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    west++;
                    break;
            }
            int times1 = Math.min(Math.min(north, south), k); // modification times for N and S
            int times2 = Math.min(Math.min(east, west), k - times1); // modification times for E and W
            ans = Math.max(
                    ans,
                    count(north, south, times1) + count(east, west, times2)
            );
        }
        return ans;
    }

    private int count(int drt1, int drt2, int times) {
        return Math.abs(drt1 - drt2) + times * 2; // Calculate modified Manhattan distance
    }
    // time = O(n)
    // spae = O(1)
}
