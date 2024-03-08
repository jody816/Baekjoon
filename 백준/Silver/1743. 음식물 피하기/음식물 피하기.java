import java.util.*;
import java.io.*;

public class Main {

  static int n, m, k;
  static String[][] map;
  static boolean[][] check;
  static int max = 0, count = 0;
  static int[] x = {0, 0, 1, -1};
  static int[] y = {1, -1, 0, 0};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    map = new String[n][m];
    check = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        map[i][j] = ".";
      }
    }

    for (int i = 0; i < k; i++) {
      int x, y;
      st = new StringTokenizer(br.readLine());

      x = Integer.parseInt(st.nextToken());
      y = Integer.parseInt(st.nextToken());

      map[x-1][y-1] = "#";
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (!check[i][j]) {
          if (map[i][j].equals(".")) {
            check[i][j] = true;
          } else {
            dfs(i, j);
            count = 0;
          }
        }
      }
    }

    bw.write(String.valueOf(max));
    bw.flush();
    bw.close();
  }

  static void dfs(int i, int j) {

    check[i][j] = true;
    count++;

    for (int k = 0; k < 4; k++) {

      int nx = i + x[k];
      int ny = j + y[k];

      if (nx >= 0 && nx < n && ny >= 0 && ny < m && !check[nx][ny] && map[nx][ny].equals("#")) {
        dfs(nx, ny);
      }
    }

    max = Math.max(max, count);
  }
}
