import java.util.*;

class Solution {
    
    static Queue<Integer> q = new LinkedList<>();
    static Stack<Integer> s = new Stack<>();
    static Stack<Integer> resultStack = new Stack<>();

    static public int solution(int[] order) {

        for (int i : order) {
            q.offer(i);
        }

        for (int i = 0; i < order.length; i++) {

            if (q.peek() != (i+1)) {

                if (!s.isEmpty() && Objects.equals(s.peek(), q.peek())) {
                    resultStack.push(q.poll());
                    s.pop();
                    i--;
                    continue;
                }

                s.push(i+1);
                continue;
            }

            resultStack.push(q.poll());
        }
        
        int l = 0;
        if (!q.isEmpty()) l = s.size();

        for (int i = 0; i < l; i++) {

            if (Objects.equals(q.peek(), s.peek())) {
                resultStack.push(q.poll());
                s.pop();
            } else {
                break;
            }
        }

        return resultStack.size();
    }
}