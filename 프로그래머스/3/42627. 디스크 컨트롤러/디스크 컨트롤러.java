import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));
        
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        int c = 0;
        int idx = 0;
        int time = 0;
        int answer = 0;
        while (c < jobs.length) {
            
            while (idx < jobs.length && jobs[idx][0] <= time) {
                queue.offer(jobs[idx++]);
            }
            
            if (queue.isEmpty()) {
                time = jobs[idx][0];
                
            } else {
                
                int[] x = queue.poll();
                answer += x[1] + (time - x[0]);
                time += x[1];
                c++;
            }
        }

        return (int) Math.floor(answer / c);
    }
}