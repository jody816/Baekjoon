import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    Deque<Integer> d = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
      String[] x = br.readLine().split(" ");

      switch(Integer.parseInt(x[0])) {

        case 1:
          d.offerFirst(Integer.parseInt(x[1]));
          break;

        case 2:
          d.offerLast(Integer.parseInt(x[1]));
          break;

        case 3:
          if (d.isEmpty()) {
            bw.write(-1 + "\n");
          } else {
            bw.write(d.pollFirst() + "\n");
          }
          break;

        case 4:
          if (d.isEmpty()) {
            bw.write(-1 + "\n");
          } else {
            bw.write(d.pollLast() + "\n");
          }
          break;

        case 5:
          bw.write(d.size() + "\n");
          break;

        case 6:
          if (d.isEmpty()) {
            bw.write(1 + "\n");
          } else {
            bw.write(0 + "\n");
          }
          break;

        case 7:
          if (d.isEmpty()) {
            bw.write(-1 + "\n");
          } else {
            bw.write(d.peekFirst() + "\n");
          }
          break;

        case 8:
          if (d.isEmpty()) {
            bw.write(-1 + "\n");
          } else {
            bw.write(d.peekLast() + "\n");
          }
          break;
      }
    }

    bw.flush();
    bw.close();
  }
}
