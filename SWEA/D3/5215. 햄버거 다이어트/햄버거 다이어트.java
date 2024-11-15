import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class Solution
{

  static int el, limit, result = 0;
  static int[][] arr;
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine().trim());

    for (int i = 1; i <= t; i++) {

      String[] x = br.readLine().trim().split(" ");

      el = Integer.parseInt(x[0]);
      limit = Integer.parseInt(x[1]);

      arr = new int[el][2];

      for (int j = 0; j < el; j++) {

        arr[j] = Arrays.stream(br.readLine().trim().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
      }

      result = 0;
      dfs(0, 0, 0);

      bw.write("#" + i + " " + result + "\n");
    }

    bw.flush();
    bw.close();
  }

  private static void dfs(int depth, int taste, int cal) {

    if (cal > limit) {
      return;
    }

    result = Math.max(result, taste);

    if (depth == el) {
      return;
    }

    dfs(depth+1, taste+arr[depth][0], cal+arr[depth][1]);
    dfs(depth+1, taste, cal);
  }
}
