import java.util.PriorityQueue;

class Solution {
    
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (String operation : operations) {

            if (operation.charAt(0) == 'I') {
                String[] x = operation.split(" ");
                queue.offer(Integer.parseInt(x[1]));

            } else if (operation.charAt(0) == 'D' && queue.size() > 0) {

                if (operation.length() == 3) {
                    Object[] objects = queue.toArray();

                    int max = queue.peek();
                    for (Object o : objects) {
                        if (max < Integer.parseInt(String.valueOf(o))) {
                            max = Integer.parseInt(String.valueOf(o));
                        }
                    }
                    queue.remove(max);
                } else {
                    queue.poll();
                }
            }
        }

        if (queue.size() == 0)
            return new int[]{0, 0};
        else if (queue.size() == 1) {
            return new int[]{queue.peek(), queue.peek()};
        } else {
            int min = queue.peek();
            int max = queue.peek();

            for (Integer i : queue) {

                if (i > max) {
                    max = i;
                }
            }

            return new int[]{max, min};
        }
    }
}