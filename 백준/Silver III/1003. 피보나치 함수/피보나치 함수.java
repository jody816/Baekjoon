import java.util.*;
import java.io.*;

public class Main {
  static Integer[][] dp = new Integer[41][2];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
    dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수

    dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
    dp[1][1] = 1;	// N=1 일 때의 1 호출 횟수

    for (int i = 0; i < T; i++) {
      int n = Integer.parseInt(br.readLine());
      fib(n);
      bw.write(dp[n][0] + " " + dp[n][1] + "\n");
    }
    bw.flush();
    bw.close();
  }

  private static Integer[] fib(int n) {

    if (dp[n][0] == null || dp[n][1] == null) {

      dp[n][0] = fib(n-1)[0] + fib(n-2)[0];
      dp[n][1] = fib(n-1)[1] + fib(n-2)[1];
    }

    return dp[n];
  }
}
