import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Deque<Integer> deque = new ArrayDeque<>();

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {

      String[] input = br.readLine().split(" ");

      switch(input[0]) {

        case "push":
          deque.add(Integer.parseInt(input[1]));
          break;

        case "pop":
          if (deque.isEmpty()) {
            bw.write(-1 + "\n");
          } else {
            bw.write(deque.pollFirst() + "\n");
          }
          break;

        case "size":
          bw.write(deque.size() + "\n");
          break;

        case "empty":
          if (deque.isEmpty()) {
            bw.write(1 + "\n");
          } else {
            bw.write(0 + "\n");
          }
          break;

        case "front":
          if (deque.isEmpty()) {
            bw.write(-1 + "\n");
          } else {
            bw.write(deque.peekFirst() + "\n");
          }
          break;

        case "back":
          if (deque.isEmpty()) {
            bw.write(-1 + "\n");
          } else {
            bw.write(deque.peekLast() + "\n");
          }
          break;
      }
    }

    br.close();
    bw.flush();
    bw.close();
  }
}