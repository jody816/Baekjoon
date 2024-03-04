import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static long[] arr;
  static int[] cal;
  static long max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    arr = Arrays.stream(br.readLine().split(" "))
            .mapToLong(Long::parseLong).toArray();

    cal = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt).toArray();

    dfs(arr[0], 1);

    bw.write(max + "\n" + min);
    bw.flush();
    bw.close();
  }

  static void dfs(long sum, int depth) {
    if (depth == n) {
      max = Math.max(max, sum);
      min = Math.min(min, sum);
      return;
    }

    for (int i = 0; i < 4; i++) {
      if (cal[i] > 0) {
        cal[i]--;

        switch (i) {

          case 0: dfs(sum + arr[depth], depth+1); break;
          case 1: dfs(sum - arr[depth], depth+1); break;
          case 2: dfs(sum * arr[depth], depth+1); break;
          case 3: dfs(sum / arr[depth], depth+1); break;
        }

        cal[i]++;
      }
    }
  }
}
