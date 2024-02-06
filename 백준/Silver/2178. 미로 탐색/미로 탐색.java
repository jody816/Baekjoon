import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static int m;
  static int[][] miro;
  static boolean[][] visit;
  static int[] mx = {0, 0, 1, -1};
  static int[] my = {1, -1, 0, 0};
  static Queue<int[]> queue = new LinkedList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer input = new StringTokenizer(br.readLine());

    n = Integer.parseInt(input.nextToken());
    m = Integer.parseInt(input.nextToken());

    miro = new int[n][m];
    visit = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      String x = br.readLine();

      for (int j = 0; j < x.length(); j++) {
        miro[i][j] = Integer.parseInt(String.valueOf(x.charAt(j)));
      }
    }
    br.close();
    
    bfs(0, 0);

    bw.write(String.valueOf(miro[n - 1][m - 1]));
    bw.flush();
    bw.close();
  }

  private static void bfs(int x, int y) {

    visit[x][y] = true;
    queue.offer(new int[]{x, y});

    O: while (!queue.isEmpty()) {

      int X = queue.peek()[0];
      int Y = queue.peek()[1];
      queue.poll();

      for (int i = 0; i < 4; i++) {
        int newX = mx[i] + X;
        int newY = my[i] + Y;

        if (newX >= 0 && newX < n && newY >= 0 && newY < m
        && !visit[newX][newY] && miro[newX][newY] == 1) {

          miro[newX][newY] = miro[X][Y] + 1;
          visit[newX][newY] = true;

          queue.offer(new int[]{newX, newY});
        }
      }
    }
  }
}