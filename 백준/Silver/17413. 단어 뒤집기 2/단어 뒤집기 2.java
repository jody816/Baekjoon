import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder result = new StringBuilder();

    String x = br.readLine();

    Queue<Character> queue = new LinkedList<>();

    if (x.contains("<")) {

      for (int i = 0; i < x.length(); i++) {
        queue.add(x.charAt(i));
      }

      boolean flag = false;
      StringBuilder sb = new StringBuilder();

      while (queue.size() != 0) {

        if (queue.peek() == '<') {
          flag = true;

          if (sb.length() > 0) {

            StringTokenizer st = new StringTokenizer(sb.toString());

            while (st.hasMoreTokens()) {
              StringBuilder builder = new StringBuilder(st.nextToken());
              result.append(builder.reverse()).append(" ");
            }
            result.deleteCharAt(result.length()-1);
            sb = new StringBuilder();
          }
          
          result.append(queue.poll());
          
        } else if (queue.peek() == '>') {
          flag = false;
          result.append(queue.poll());
          continue;
        }

        if (flag) {
          result.append(queue.poll());
        } else {
          sb.append(queue.poll());
        }
      }

      if (sb.length() > 0) {
        StringTokenizer st = new StringTokenizer(sb.toString());

        while (st.hasMoreTokens()) {
          StringBuilder builder = new StringBuilder(st.nextToken());
          result.append(builder.reverse()).append(" ");
        }
      }

    } else {

      StringTokenizer st = new StringTokenizer(x);

      while (st.hasMoreTokens()) {
        StringBuilder sb = new StringBuilder(st.nextToken());
        result.append(sb.reverse()).append(" ");
      }
    }

    bw.write(result.toString());
    bw.flush();
    bw.close();
  }
}
