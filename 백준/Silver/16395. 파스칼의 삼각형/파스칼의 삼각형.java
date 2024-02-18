import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static int k;
  static Long[][] dp = new Long[31][31];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    dp[1][1] = 1L;
    dp[2][1] = 1L;
    dp[2][2] = 1L;

    int p = 3;
    for (int i = 3; i < 31; i++) {
      for (int j = 1; j < p+1; j++) {

        if (j == 1 || j == p) {
          dp[i][j] = 1L;
          continue;
        }

        dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
      }
      p++;
    }

//    for (int i = 0; i < 31; i++) {
//      for (int j = 0; j < 31; j++) {
//        System.out.print(dp[i][j] + " ");
//      }
//      System.out.println();
//    }

    bw.write(String.valueOf(dp[n][k]));
    bw.flush();
    bw.close();
  }
}
