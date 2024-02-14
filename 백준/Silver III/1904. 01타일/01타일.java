import java.util.*;
import java.io.*;

public class Main {

  static int[] dp = new int[1000001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    br.close();

    dp[1] = 1;
    dp[2] = 2;

    bw.write(String.valueOf(tile(n)));
    bw.flush();
    bw.close();
  }

  static int tile(int n) {

    if (dp[n] == 0) {
      dp[n] = (tile(n-1) + tile(n-2)) % 15746;
    }

    return dp[n];
  }
}
