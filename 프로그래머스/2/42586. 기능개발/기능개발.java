import java.util.*;

class Solution {
    static Queue<Integer> pq = new LinkedList<>();
    static Queue<Integer> sq = new LinkedList<>();
    static List<Integer> list = new ArrayList<>();
    public int[] solution(int[] progresses, int[] speeds) {
        for (int i = 0; i < speeds.length; i++) {
            pq.offer(progresses[i]);
            sq.offer(speeds[i]);
        }
        
        while (!pq.isEmpty()) {
            
            int c = pq.size();
            
            for (int i = 0; i < c; i++) {
                int p = pq.poll();
                int s = sq.poll();
                
                int ps = p+s;
                
                pq.offer(ps);
                sq.offer(s);
            }
            
            // System.out.println("pq: " + pq);
            // System.out.println("sq: " + sq + "\n----------");
            
            int d = 0;
            for (int i = 0; i < c; i++) {
                if (pq.peek() >= 100) {
                    pq.poll();
                    sq.poll();
                    d++;
                } else {
                    break;
                }
            }
            
            if (d > 0) {
                list.add(d);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}