import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    O: while (true) {

      String input = br.readLine();

      if (input.equals(".")) {
        bw.flush();
        bw.close();
        return;
      }

      Stack<Character> stack = new Stack<>();

      for (int i = 0; i < input.length(); i++) {

        if (input.charAt(i) == '(' || input.charAt(i) == '[') {
          stack.push(input.charAt(i));
        } else if (input.charAt(i) == ')') {
          if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
          } else {
            bw.write("no\n");
            continue O;
          }
        } else if (input.charAt(i) == ']') {
          if (!stack.isEmpty() && stack.peek() == '[') {
            stack.pop();
          } else {
            bw.write("no\n");
            continue O;
          }
        }
      }

      if (stack.isEmpty()) {
        bw.write("yes\n");
      } else {
        bw.write("no\n");
      }
    }
  }
}
