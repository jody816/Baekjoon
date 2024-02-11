import java.util.*;
import java.io.*;

public class Main {

  static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    int[] array = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();

    Stack<Integer> stack = new Stack<>();

    int count = 1;
    for (int i = 0; i < array.length; i++) {

      if (count != array[i]) {
        if (!stack.isEmpty() && stack.peek() == count) {
          stack.pop();
          count++;
          i--;
        } else {
          stack.push(array[i]);
        }
      } else {
        count++;
      }
    }

    while (!stack.isEmpty() && stack.peek() == count) {
      stack.pop();
      count++;
    }

    if (stack.isEmpty()) {
      bw.write("Nice");
    } else {
      bw.write("Sad");
    }

    bw.flush();
    bw.close();
  }
}
