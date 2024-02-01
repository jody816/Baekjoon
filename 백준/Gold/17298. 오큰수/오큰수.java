import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int[] result = new int[a];
    for (int i = 0; i < a; i++) {
      result[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < a; i++) {

      while (!stack.isEmpty() && result[stack.peek()] < result[i]) {

        result[stack.pop()] = result[i];
      }

      stack.push(i);
    }

    while (!stack.isEmpty()) {

      result[stack.pop()] = -1;
    }

    for (int s : result) {
      bw.write(s + " ");
    }
    bw.flush();
    bw.close();
  }
}
