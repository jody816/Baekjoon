import java.util.*;
import java.io.*;

public class Main {

  static int r;
  static int c;
  static int w;
  static Long[][] dp = new Long[31][31];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    w = Integer.parseInt(st.nextToken());

    dp[1][1] = 1L;
    dp[2][1] = 1L;
    dp[2][2] = 1L;

    for (int i = 3; i < 31; i++) {
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
          dp[i][j] = 1L;
          continue;
        }
        dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
      }
    }

    int p = 0;
    long sum = 0;
    for (int i = r; i < r+w; i++) {
      for (int j = c; j <= c+p; j++) {
        sum += dp[i][j];
      }
      p++;
    }

    bw.write(String.valueOf(sum));
    bw.flush();
    bw.close();
  }
}
