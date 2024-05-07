import java.util.*;
class Solution {
  static Queue<Integer> q1 = new LinkedList<>();
  static Queue<Integer> q2 = new LinkedList<>();
  static long q1sum = 0, total = 0;
  static int count = 0;
  public int solution(int[] queue1, int[] queue2) {

    for (int i = 0; i < queue1.length; i++) {
      q1.offer(queue1[i]);
      q2.offer(queue2[i]);
      total += (queue1[i]+queue2[i]);
      q1sum += queue1[i];
    }

    if (total%2 == 1) {
      return -1;
    }

    long goal = total/2;

    while (q1sum != goal) {

      if (count >= queue1.length * 4) {
        return -1;
      }

      if (q1sum > goal) {

        q1sum -= q1.peek();
        q2.offer(q1.poll());
      } else if (q1sum < goal){

        q1sum += q2.peek();
        q1.offer(q2.poll());
      } else {
        return count;
      }
      count++;
    }

    return count;
  }
}