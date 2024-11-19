import java.io.*;
import java.util.*;

public class Main {

  static int n;
  static int[][] map;
  static boolean[][] visit;
  static int result = 1;
  static Set<Integer> set = new HashSet<>();
  static int[] X = {0, 0, 1, -1};
  static int[] Y = {1, -1, 0, 0};

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    map = new int[n][n];

    for (int i = 0; i < n; i++) {
      map[i] = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt)
          .toArray();

      for (int j : map[i]) {
        set.add(j);
      }
    }

    for (int i : set) {
      visit = new boolean[n][n];
      int c = 0;

      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          if (map[j][k] > i && !visit[j][k]) {
            dfs(j, k, i);
            c++;
          }
        }
      }

      result = Math.max(result, c);
    }

    bw.write(String.valueOf(result));
    bw.flush();
    bw.close();
  }

  private static void dfs(int x, int y, int num) {
    visit[x][y] = true;

    for (int i = 0; i < 4; i++) {
      int nx = X[i] + x;
      int ny = Y[i] + y;

      if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] > num && !visit[nx][ny]) {
        dfs(nx, ny, num);
      }
    }
  }
}
