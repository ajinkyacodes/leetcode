package M02_February2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/*
Link: https://www.geeksforgeeks.org/problems/find-median-in-a-stream-1587115620/1
Find median in a stream
 */
public class G250220_Hard_Find_median_in_a_stream {
    public ArrayList<Double> getMedian(int[] arr) {
        PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        ArrayList<Double> res = new ArrayList<>();

        for (int n : arr) {
            maxH.add(n);
            minH.add(maxH.poll());
            if (maxH.size() < minH.size()) maxH.add(minH.poll());
            res.add(maxH.size() > minH.size() ? (double) maxH.peek() : (maxH.peek() + minH.peek()) / 2.0);
        }
        return res;
    }
}
