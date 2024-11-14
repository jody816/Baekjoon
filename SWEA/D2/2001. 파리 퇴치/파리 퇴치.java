import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class Solution
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    for (int i = 1; i <= t; i++) {

      String[] x = br.readLine().trim().split(" ");

      int n = Integer.parseInt(x[0]);
      int m = Integer.parseInt(x[1]);

      int[][] arr = new int[n][n];

      for (int j = 0; j < n; j++) {
        arr[j] = Arrays.stream(br.readLine().trim().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
      }

      int max = 0;

      for (int k = 0; k <= n-m; k++) {
        for (int r = 0; r <= n-m; r++) {

          int sum = 0;

          for (int u = k; u < k+m; u++) {
            for (int v = r; v < r+m; v++) {
              sum += arr[u][v];
            }
          }

          max = Math.max(max, sum);
        }
      }

      bw.write("#" + i + " " + max + "\n");
    }

    bw.flush();
    bw.close();
  }
}
