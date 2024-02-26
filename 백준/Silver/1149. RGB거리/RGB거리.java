import java.util.*;
import java.io.*;

public class Main {
  static int n;
  static int[][] map;
  static int[][] dp;

  final static int Red = 0;
  final static int Green = 1;
  final static int Blue = 2;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    map = new int[n][3];
    dp = new int[n][3];

    for (int i = 0; i < n; i++) {
      map[i] = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();
    }

    // dp 첫 번째 값 초기화
    dp[0][Red] = map[0][Red];
    dp[0][Green] = map[0][Green];
    dp[0][Blue] = map[0][Blue];

    bw.write(String.valueOf(Math.min(paint(n-1, Red), Math.min(paint(n-1, Green), paint(n-1, Blue)))));
    bw.flush();
    bw.close();
  }

  static int paint(int N, int color) {

    if (dp[N][color] == 0) {

      if (color == Red) {
        dp[N][Red] = Math.min(paint(N-1, Green), paint(N-1, Blue)) + map[N][Red];
      } else if (color == Green) {
        dp[N][Green] = Math.min(paint(N-1, Red), paint(N-1, Blue)) + map[N][Green];
      } else {
        dp[N][Blue] = Math.min(paint(N-1, Red), paint(N-1, Green)) + map[N][Blue];
      }
    }

    // 위에서 결국 제일 낮은 값이 출력됨
    return dp[N][color];
  }
}
