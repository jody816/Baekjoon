import java.io.*;
import java.util.*;

// DP 메모이제이션 문제
public class Main {
  static Integer[] dp;
  static int n;
  static int[] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    // <자바>
    // int[]로 입력을 받을 때, 사용하면 편한 코드
    // Integer[] 은 안됨!
    arr = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt).toArray();

    dp = new Integer[n];

    // Top-down (재귀) 방식
    for (int i = 0; i < n; i++) {
      LIS(i);
    }

    // 제일 높은 값이 저장된 배열 탐색
    int max = dp[0];

    for (int i = 1; i < n; i++) {
      max = Math.max(max, dp[i]);
    }

    // 정답 출력
    bw.write(String.valueOf(max));
    bw.flush();
    bw.close();
  }

  // LIS는 "Longest Increasing Subsequence(최장 증가 부분 수열)"를
  // 계산하는 알고리즘을 설명할 때 사용되는 용어... 라고 하네요
  static int LIS(int n) {

    // null이면 메모가 되지 않은 것!
    if (dp[n] == null) {

      // 자기 자신 초기화
      dp[n] = 1;

      /*
      자신의 인덱스를 시작으로 거꾸로 탐색
      첫번 째(인덱스 0)일 땐,
      이전 인덱스가 없으므로 무조건 1!
       */
      for (int i = n - 1; i >= 0; i--) {

        // 자신 이전의 인덱스가 큰지 작은지를 체크
        if (arr[i] < arr[n]) {

          // 작은 '수'가 발견이 된다면
          // 재귀가 들어가고, 메모가 되어 있다면
          // 바로 dp값을 리턴해주고
          // 그렇게 나온 값과 1 (자기 자신)을 더해줌
          dp[n] = Math.max(dp[n], LIS(i) + 1);
        }
      }
    }

    return dp[n];
  }
}
