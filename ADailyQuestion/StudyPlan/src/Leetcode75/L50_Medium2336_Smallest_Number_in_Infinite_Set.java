package Leetcode75;
/*
Link: https://leetcode.com/problems/smallest-number-in-infinite-set/description/
2336. Smallest Number in Infinite Set
 */
import java.util.*;
public class L50_Medium2336_Smallest_Number_in_Infinite_Set {
    private HashSet<Integer> isPresent;
    private PriorityQueue<Integer> addedIntegers;
    private Integer currentInteger;

    // Constructor
    public L50_Medium2336_Smallest_Number_in_Infinite_Set() {
        isPresent = new HashSet<>();
        addedIntegers = new PriorityQueue<>();
        currentInteger = 1;
    }

    public int popSmallest() {
        int answer;
        // If there are numbers in the min-heap,
        // top element is lowest among all the available numbers.
        if (!addedIntegers.isEmpty()) {
            answer = addedIntegers.poll();
            isPresent.remove(answer);
        }
        // Otherwise, the smallest number of large positive set
        // denoted by 'currentInteger' is the answer.
        else {
            answer = currentInteger;
            currentInteger += 1;
        }
        return answer;
    }

    public void addBack(int num) {
        if (currentInteger <= num || isPresent.contains(num)) {
            return;
        }
        // We push 'num' in the min-heap if it isn't already present.
        addedIntegers.add(num);
        isPresent.add(num);
    }
    // time = O((m+n)⋅logn)
    // space = O(n)
}
