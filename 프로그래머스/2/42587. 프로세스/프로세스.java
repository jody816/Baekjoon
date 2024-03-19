import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            q.offer(priorities[i]);
        }
        
        Arrays.sort(priorities);
        int l = priorities.length-1;
        
        while (true) {
            if (q.peek() == priorities[l] && location == 0) {
                count++;
                break;
            }
            
            if (q.peek() == priorities[l]) {
                q.poll();
                count++;
                l--;
                location--;
            } else {
                q.offer(q.poll());
                location--;
            }
            
            if (location < 0) {
                location = q.size()-1;
            }
        }
        
        return count;
    }
}