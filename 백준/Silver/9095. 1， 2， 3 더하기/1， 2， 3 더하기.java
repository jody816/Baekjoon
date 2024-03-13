import java.io.*;
import java.util.*;

public class Main {

  static int T;
  static int[] dp = new int[11];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    T = Integer.parseInt(br.readLine());

    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;
    dp[4] = 7;

    for (int i = 5; i <= 10; i++) {
      dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
    }
    
    for (int i = 0; i < T; i++) {
      bw.write(dp[Integer.parseInt(br.readLine())] + "\n");
    }

    bw.flush();
    bw.close();
  }
}
