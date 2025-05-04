package M04_April2025;
/*
Link: https://leetcode.com/problems/rabbits-in-forest/description/
781. Rabbits in Forest
 */
public class L250420_Medium781_Rabbits_in_Forest {
    public int numRabbits(int[] answers) {
        int[] count = new int[1000];
        for (int x: answers) count[x]++;

        int ans = 0;
        for (int k = 0; k < 1000; ++k)
            ans += Math.floorMod(-count[k], k+1) + count[k];
        return ans;
    }
    // time = O(N)
    // space = O(N)
}
