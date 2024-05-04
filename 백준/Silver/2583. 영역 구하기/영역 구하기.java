import java.util.*;
import java.io.*;

class Main {

  static int m, n, k;
  static int[][] board;
  static int[] x = {0, 0, 1, -1};
  static int[] y = {1, -1, 0, 0};
  static int count = 0;
  static List<Integer> result = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    m = Integer.parseInt(st.nextToken());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    board = new int[m][n];
      
    for (int i = 0; i < k; i++) {
      int[] grid = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();

      for (int j = grid[0]; j < grid[2]; j++) {
        for (int r = grid[1]; r < grid[3]; r++) {
          board[r][j] = 1;
        }
      }
    }

    for (int j = 0; j < m; j++) {
      for (int r = 0; r < n; r++) {
        if (board[j][r] == 0) {
          dfs(j, r);
          result.add(count);
          count = 0;
        }
      }
    }

    Collections.sort(result);

    bw.write(result.size() + "\n");
    for (Integer i : result) {
      bw.write(i + " ");
    }
    bw.flush();
    bw.close();
  }

  static private void dfs(int a, int b) {

    board[a][b] = 1;
    count++;

    for (int i = 0; i < 4; i++) {

      int X = a + x[i];
      int Y = b + y[i];

      if (X >= 0 && X < m && Y >= 0 && Y < n && board[X][Y] == 0) {
        dfs(X, Y);
      }
    }
  }
}