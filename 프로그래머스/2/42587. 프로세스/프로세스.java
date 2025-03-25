import java.util.*;

class Solution {
    static Queue<Integer> q = new LinkedList<>();
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        for (int i : priorities) {
            q.offer(i);
        }
        
        Arrays.sort(priorities);
        int idx = priorities.length-1;
        
        int seq = 1;
        while (!q.isEmpty()) {
            
            if (location < 0) {
                location = (q.size()+location);
            }
            // System.out.println("q: " + q);
            // System.out.println("loc: " + location + "\n" + "-".repeat(5));
            int first = q.poll();
            
            if (priorities[idx] != first) {
                q.offer(first);
                location--;
            } else {
                
                if (location == 0) {
                    return seq;
                } else {
                    seq++;
                    idx--;
                    location--;
                }
            }
        }
        
        return answer;
    }
}