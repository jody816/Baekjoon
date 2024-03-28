import java.util.*;

class Solution {
    
    static Queue<Integer> q = new LinkedList<>();
    static Queue<Integer> sp = new LinkedList<>();
    static ArrayList<Integer> result = new ArrayList<>();
    static int[] answer;
    
    public int[] solution(int[] progresses, int[] speeds) {
        for (int i = 0; i < speeds.length; i++) {
            q.offer(progresses[i]);
            sp.offer(speeds[i]);
        }
        
        int count = 0;
        while (!q.isEmpty()) {
            if (q.peek() >= 100) {
                count++;
                q.poll();
                sp.poll();
                continue;
            }
            
            if (count > 0) {
                result.add(count);
                count = 0;
            } else {
                for (int i = 0; i < q.size(); i++) {
                    int newQ = q.poll();
                    int newSp = sp.poll();
                    
                    q.offer(newQ + newSp);
                    sp.offer(newSp);
                }
            }
        }
        
        if (count > 0) {
            result.add(count);
        }
        
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
