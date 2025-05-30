package M02_February2025;
/*
Link: https://www.geeksforgeeks.org/problems/k-sum-paths/1
K Sum Paths
 */
import java.util.*;
public class G250210_Medium_K_Sum_Paths {
    Map<Integer,Integer> m = new HashMap<>();
    int cnt = 0;
    void dfs(Node r, int k, int s) {
        if(r==null)return;
        s += r.data;
        if(m.containsKey(s-k)) cnt += m.get(s-k);
        m.put(s, m.getOrDefault(s,0)+1);
        dfs(r.left, k, s);
        dfs(r.right, k, s);
        m.put(s, m.get(s)-1);
        if(m.get(s)==0)m.remove(s);
    }
    public int sumK(Node r, int k) {
        m.put(0,1);
        dfs(r, k, 0);
        return cnt;
    }
}
