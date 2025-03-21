import java.util.*;

class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {      
        bfs(numbers, target);
        
        return answer;
    }
    
    static void bfs(int[] numbers, int target) {
        Queue<Integer> q = new LinkedList<>();
        int x = 0;
        
        q.offer(x);
        
        while (x < numbers.length) {
            
            int length = q.size();
            for (int i = 0; i < length; i++) {
                int num = q.poll();
                
                q.offer(num - numbers[x]);
                q.offer(num + numbers[x]);
            }
            
            x++;
        }
        
        int l = q.size();
        for (int i = 0; i < l; i++) {
            int n = q.poll();
            
            if (target == n) answer++;
        }
    }
}