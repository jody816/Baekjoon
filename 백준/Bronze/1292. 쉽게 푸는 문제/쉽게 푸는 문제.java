import java.util.*;
import java.io.*;

public class Main {

  static int[] arr = new int[1000];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int x = 1;
    int idx = 0;
    O: while (true) {

      for (int i = 1; i <= x; i++) {
        arr[idx++] = x;
        if (idx == 1000) {
          break O;
        }
      }

      x++;
    }

    int sum = 0;
    for (int i = a-1; i < b; i++) {
      sum += arr[i];
    }

    bw.write(String.valueOf(sum));
    bw.flush();
    bw.close();
  }
}
