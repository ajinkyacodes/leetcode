package Leetcode75;
/*
Link: https://leetcode.com/problems/combination-sum-iii/description/
216. Combination Sum III
 */
import java.util.*;
public class L58_Medium216_Combination_Sum_III {
    protected void backtrack(
            int remain,
            int k,
            LinkedList<Integer> comb,
            int next_start,
            List<List<Integer>> results
    ) {
        if (remain == 0 && comb.size() == k) {
            // Note: it's important to make a deep copy here,
            // Otherwise the combination would be reverted in other branch of backtracking.
            results.add(new ArrayList<Integer>(comb));
            return;
        } else if (remain < 0 || comb.size() == k) {
            // Exceed the scope, no need to explore further.
            return;
        }

        // Iterate through the reduced list of candidates.
        for (int i = next_start; i < 9; ++i) {
            comb.add(i + 1);
            this.backtrack(remain - i - 1, k, comb, i + 1, results);
            comb.removeLast();
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();

        this.backtrack(n, k, comb, 0, results);
        return results;
    }
    // time = O(K×C(9,K))
    // space = O(K)
}
