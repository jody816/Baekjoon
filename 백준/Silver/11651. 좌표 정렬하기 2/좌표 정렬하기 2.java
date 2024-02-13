import java.util.*;
import java.io.*;

public class Main {
  static int n;
  static int[][] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    arr = new int[n][2];
    for (int i = 0; i < n; i++) {
      arr[i] = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();
    }

    Arrays.sort(arr, (o1, o2) -> {
      // y를 기준으로
      // 두 번째 원소가 같다면 첫 번째 원소 비교
      if (o1[1] == o2[1]) {
        return o1[0] - o2[0];
      } else {
        return o1[1] - o2[1];
      }
    });

    for (int i = 0; i < n; i++) {
      bw.write(arr[i][0] + " " + arr[i][1] + "\n");
    }

    bw.flush();
    bw.close();
  }
}
