import java.util.*;
import java.io.*;

public class Main {

  static int a;
  static int b;
  static int c;

  /*
   * 함수 w에서 a, b, c 중 20이 넘어가게 되면 w(20, 20, 20)을 호출하고,
   * 0 이하일 경우는 1을 반환하기 때문에
   * 각 배열의 크기가 21 (0~20)을 넘기지 않는다.
   */
  static int[][][] dp = new int[21][21][21];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      StringTokenizer input = new StringTokenizer(br.readLine());
      a = Integer.parseInt(input.nextToken());
      b = Integer.parseInt(input.nextToken());
      c = Integer.parseInt(input.nextToken());

      if (a == -1 && b == -1 && c == -1) {
        bw.flush();
        bw.close();
        return;
      }

      bw.write("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) + "\n");
    }
  }

  private static int w(int a, int b, int c) {

    // a, b, c가 범위를 벗어나지 않으면서 메모이제이션이 되어있는 경우
    // 이미 계산되어 저장되어있는 경우 해당 값을 바로 반환
    if (inRange(a, b ,c) && dp[a][b][c] != 0) {
      return dp[a][b][c];
    }

    if (a <= 0 || b <= 0 || c <= 0) {
      return 1;
    }

    /*
     * a, b, c중 하나라도 20이 넘어가면 w(20, 20, 20)을 호출하기 때문에
     * dp[20][20][20] 에 저장하고 반환하면 된다.
     */
    else if(a > 20 || b > 20 || c > 20) {
        return dp[20][20][20] = w(20, 20, 20);
      }

    else if (a < b && b < c) {
      return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
    }

    else {
      return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }
  }

  /*
   *  배열을 참조하려 할 때 a, b, c 중 하나라도 범위 밖의 수가
   *  나올 수 있기 때문에 이를 체크를 해주기 위한 함수다.
   */
  static boolean inRange(int a, int b, int c) {
    return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
  }
}
