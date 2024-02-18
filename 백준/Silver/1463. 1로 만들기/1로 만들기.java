import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static Integer[] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    br.close();

    dp = new Integer[n+1];
    dp[0] = dp[1] = 0;

    bw.write(String.valueOf(recur(n)));
    bw.flush();
    bw.close();
  }

  static int recur(int n) {

    // 메모이제이션

    // 탐색하지 않은 n일 경우
    if (dp[n] == null) {

      // 6 으로 나눠지는 경우
      if (n%6 == 0) {
        dp[n] = Math.min(recur(n/3), Math.min(recur(n/2), recur(n-1))) + 1;
      } else if (n%3 == 0) {
        dp[n] = Math.min(recur(n/3), recur(n-1)) + 1;
      } else if (n%2 == 0) {
        dp[n] = Math.min(recur(n/2), recur(n-1)) + 1;
      } else {
        dp[n] = recur(n-1) + 1;
      }
    }

    return dp[n];
  }
}
