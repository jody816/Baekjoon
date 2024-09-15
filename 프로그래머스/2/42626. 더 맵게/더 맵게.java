import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            queue.offer(scoville[i]);
        }
        
        int count = 0;
        while (queue.peek() < K) {
            
            if (queue.size() < 2) {
                return -1;
            }
            
            count++;
            int r = queue.poll() + (queue.poll() * 2);
            
            queue.offer(r);
        }
        
        return count;
    }
}