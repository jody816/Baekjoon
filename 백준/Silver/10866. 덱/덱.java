import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    Deque<Integer> deque = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split(" ");
      String command = input[0];

      switch (command) {
        case "push_front" :
          deque.addFirst(Integer.parseInt(input[1]));
          break;

        case "push_back" :
          deque.addLast(Integer.parseInt(input[1]));
          break;

        case "pop_front" :
          if (deque.peekFirst() == null) {
            bw.write(-1 + "\n");
            continue;
          }
          bw.write(deque.pollFirst() + "\n");
          break;

        case "pop_back" :
          if (deque.peekLast() == null) {
            bw.write(-1 + "\n");
            continue;
          }
          bw.write(deque.pollLast() + "\n");
          break;

        case "size" :
          bw.write(deque.size() + "\n");
          break;

        case "empty" :
          if (deque.isEmpty()) {
            bw.write(1 + "\n");
          } else {
            bw.write(0 + "\n");
          }
          break;

        case "front" :
          if (deque.peekFirst() != null) {
            bw.write(deque.peekFirst() + "\n");
          } else {
            bw.write(-1 + "\n");
          }
          break;

        case "back" :
          if (deque.peekLast() != null) {
            bw.write(deque.peekLast() + "\n");
          } else {
            bw.write(-1 + "\n");
          }
          break;
      }
    }

    bw.flush();
    bw.close();
  }
}
