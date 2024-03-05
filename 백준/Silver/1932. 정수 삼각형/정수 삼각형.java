import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static int[][] arr;
  static Integer[][] dp;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = new int[n][n];
    dp = new Integer[n][n];

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j <= i; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 마지막 행의 값들을 넣어줌
    for (int i = 0; i < n; i++) {
      dp[n-1][i] = arr[n-1][i];
    }

    bw.write(String.valueOf(find(0, 0)));
    bw.flush();
    bw.close();
  }

  static int find(int depth, int idx) {
    // 마지막 행일 때 현재 위치의 dp 값을 반환
    if (depth == n-1) {
      return dp[depth][idx];
    }

    // 탐색하지 않은 값일 때 다음 행의 양쪽 값을 비교
    if (dp[depth][idx] == null) {
      dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
    }

    return dp[depth][idx];
  }
}
