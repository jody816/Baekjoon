import java.util.*;

class Solution {
    
    static int contain = 0;
    static Queue<Integer> q = new LinkedList<>();
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        for (int t : truck_weights) {
            
            while (true) {
                if (q.isEmpty()) {
                    q.offer(t);
                    contain += t;
                    answer++;
                    break;
                } else {
                    if (q.size() == bridge_length) {
                        contain -= q.poll();
                    } else if (contain + t > weight) {
                        q.offer(0);
                        answer++;
                    } else if (contain + t <= weight) {
                        q.offer(t);
                        answer++;
                        contain += t;
                        break;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}