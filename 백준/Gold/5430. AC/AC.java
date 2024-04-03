import java.util.*;
import java.io.*;

public class Main {

  static int t;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    t = Integer.parseInt(br.readLine());

    O: for (int r = 0; r < t; r++) {
      String command = br.readLine().replaceAll("RR", "");
      int length = Integer.parseInt(br.readLine());
      String x = br.readLine();
      String input;

      if (x.length() == 2) {
        for (int i = 0; i < command.length(); i++) {
          if (command.charAt(i) == 'D') {
            bw.write("error\n");
            continue O;
          }
        }

        bw.write("[]\n");
        continue;
      } else {
        input = x.substring(1, x.length()-1);
      }

      Deque<Integer> list = new ArrayDeque<>();
      int[] arr = Arrays.stream(input.split(","))
          .mapToInt(Integer::parseInt).toArray();

      for (int i : arr) {
        list.offer(i);
      }

      boolean check = false;
      for (int i = 0; i < command.length(); i++) {
        if (command.charAt(i) == 'R') {
          check = !check;
          continue;
        }

        if (command.charAt(i) == 'D' && list.peek() == null) {
          bw.write("error\n");
          continue O;
        }

        if (list.peek() != null) {
          if (check) {
            list.pollLast();
          } else {
            list.pollFirst();
          }
        }
      }

      bw.write(result(list, check) + "\n");
//      int count = 0;
//      for (int i = 0; i < command.length(); i++) {
//        if (command.charAt(i) == 'R') {
//          count++;
//          continue;
//        }
//
//        try {
//          if (count % 2 == 0) {
//            list.remove(0);
//          } else {
//            list.remove(list.size()-1);
//          }
//        } catch (Exception e) {
//          bw.write("error\n");
//          continue O;
//        }
//      }

//      if (count % 2 == 0) {
//        bw.write(list + "\n");
//      } else {
//        Collections.reverse(list);
//        bw.write(list + "\n");
//      }
    }

    bw.flush();
    bw.close();
  }

  private static String result(Deque<Integer> list, boolean check) {

    StringBuilder sb = new StringBuilder();

    int l = list.size();
    if (l < 1) {
      sb.append("[]");
    } else {
      sb.append("[");

      if (check) {
        for (int i = 0; i < l; i++) {
          sb.append(list.pollLast()).append(",");
        }

      } else {
        for (int i = 0; i < l; i++) {
          sb.append(list.pollFirst()).append(",");
        }

      }
      sb.deleteCharAt(sb.length()-1);
      sb.append("]");
    }

    return sb.toString();
  }
}
