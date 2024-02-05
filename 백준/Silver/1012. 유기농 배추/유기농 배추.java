import java.util.*;
import java.io.*;

public class Main {

  static int m;
  static int n;
  static int[][] field;
  static boolean[][] visited;
  static int[] result;

  static int[] fx = {0, 0, 1, -1};
  static int[] fy = {1, -1, 0, 0};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    result = new int[T];

    for (int k = 0; k < T; k++) {

      StringTokenizer st = new StringTokenizer(br.readLine());
      m = Integer.parseInt(st.nextToken());
      n = Integer.parseInt(st.nextToken());
      int napaCabbage = Integer.parseInt(st.nextToken());

      field = new int[n][m];
      visited = new boolean[n][m];

      for (int i = 0; i < napaCabbage; i++) {
        StringTokenizer input = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(input.nextToken());
        int x = Integer.parseInt(input.nextToken());
        field[x][y] = 1;
      }
      
      int count = 0;
      for (int x = 0; x < n; x++) {
        for (int y = 0; y < m; y++) {
          if (field[x][y] == 1 && !visited[x][y]) {
            dfs(x, y);
            count++;
          }
        }
      }

      result[k] = count;
    }
    br.close();

    for (int j : result) {
      bw.write(j + "\n");
    }
    bw.flush();
    bw.close();
  }

  private static void dfs(int x, int y) {

    visited[x][y] = true;

    for (int i = 0; i < 4; i++) {
      int newX = fx[i] + x;
      int newY = fy[i] + y;

      if (newX >= 0 && newY >= 0 && newX < n && newY < m
      && !visited[newX][newY] && field[newX][newY] == 1) {

        dfs(newX, newY);
      }
    }
  }
}
