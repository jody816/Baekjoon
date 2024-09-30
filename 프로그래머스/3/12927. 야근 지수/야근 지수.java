import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i : works) {
            q.offer(i);
        }
        
        for (int i = 0; i < n; i++) {
            
            int x = q.poll();
            
            if (x == 0) {
                return 0;
            }
            
            q.offer(x-1);
        }
        
        long sum = 0;
        while (!q.isEmpty()) {
            sum += Math.pow(q.poll(), 2);
        }
        
        return sum;
    }
}