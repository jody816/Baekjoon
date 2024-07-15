import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        
        return bfs(numbers, target);
    }

    private static int bfs(int[] numbers, int target) {
        int x = 0;
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);

        while (x < numbers.length) {

            int length = queue.size();

            for (int i = 0; i < length; i++) {
                int q = queue.poll();

                queue.offer(q - numbers[x]);
                queue.offer(q + numbers[x]);
            }

            x++;
        }

        int length = queue.size();
        for (int i = 0; i < length; i++) {
            if (queue.poll() == target) {
                answer++;
            }
        }

        return answer;
    }
}