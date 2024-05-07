import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static int[] arr;
  static int[] operator;
  static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();
    operator = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();

    dfs(arr[0], 1);

    bw.write(max + "\n" + min);
    bw.flush();
    bw.close();
  }

  static private void dfs(int sum, int depth) {
    if (depth == arr.length) {
      max = Math.max(max, sum);
      min = Math.min(min, sum);
      return;
    }

    for (int j = 0; j < 4; j++) {

      if (operator[j] > 0) {

        operator[j]--;

        switch (j) {
          case 0: dfs(sum + arr[depth], depth+1); break;
          case 1: dfs(sum - arr[depth], depth+1); break;
          case 2: dfs(sum * arr[depth], depth+1); break;
          case 3: dfs(sum / arr[depth], depth+1); break;
        }

        operator[j]++;
      }
    }
  }
}
