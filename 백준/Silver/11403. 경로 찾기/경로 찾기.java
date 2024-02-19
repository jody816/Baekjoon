import java.util.*;
import java.io.*;

public class Main {
  static int n;
  static int[][] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      arr[i] = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();
    }

    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          // 단순히 갈 수 있는 경로가 있는지만 체크함.
          if (arr[i][k] == 1 && arr[k][j] == 1) {
            arr[i][j] = 1;
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        bw.write(arr[i][j] + " ");
      }
      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}
