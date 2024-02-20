import java.util.*;
import java.io.*;

public class Main {

  static int n, m;
  static int[][] map;
  private static final int INF = 9900001;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    m = Integer.parseInt(br.readLine());

    map = new int[n+1][n+1];

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i != j) {
          map[i][j] = INF;
        }
      }
    }

    for (int i = 0; i < m; i++) {
      StringTokenizer input = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(input.nextToken());
      int b = Integer.parseInt(input.nextToken());
      int c = Integer.parseInt(input.nextToken());

      map[a][b] = Math.min(map[a][b], c);
    }

    for (int k = 1; k < n+1; k++) {
      for (int i = 1; i < n+1; i++) {
        for (int j = 1; j < n+1; j++) {

          if (i == j) {
            continue;
          }

          if (map[i][j] > map[i][k] + map[k][j]) {
            map[i][j] = map[i][k] + map[k][j];
          }
        }
      }
    }

    for (int i = 1; i < n+1; i++) {
      for (int j = 1; j < n+1; j++) {

        if (map[i][j] == INF) {
          bw.write("0 ");
          continue;
        }

        bw.write(map[i][j] + " ");
      }
      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}
