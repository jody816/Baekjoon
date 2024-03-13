import java.io.*;
import java.util.*;

public class Main {

  static int n;
  static int[] stair;
  static Integer[] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    stair = new int[n+1];
    for (int i = 1; i <= n; i++) {
      stair[i] = Integer.parseInt(br.readLine());
    }

    dp = new Integer[n+1];
    dp[0] = stair[0];
    dp[1] = stair[1];

    if (n >= 2) {
      dp[2] = stair[1] + stair[2];
    }

    for (int i = 3; i <= n; i++) {
      dp[i] = Math.max(dp[i-2], dp[i-3] + stair[i-1]) + stair[i];
    }
    bw.write(String.valueOf(dp[n]));
    bw.flush();
    bw.close();
  }
}
