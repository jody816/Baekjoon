import java.util.*;
import java.io.*;

public class Main {
  static int m;
  static int n;
  static int[][] box;
  static Queue<int[]> q = new LinkedList<>();

  static int[] bx = {0, 0, -1, 1};
  static int[] by = {-1, 1, 0, 0};

  static int max = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer input = new StringTokenizer(br.readLine());

    m = Integer.parseInt(input.nextToken());
    n = Integer.parseInt(input.nextToken());
    box = new int[n][m];

    for (int i = 0; i < n; i++) {
      box[i] = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();

      for (int j = 0; j < m; j++) {

        if (box[i][j] == 1) {
          q.offer(new int[]{i, j});
          max = 1;
        }
      }
    }

    bfs();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (box[i][j] == 0) {
          bw.write(String.valueOf(-1));
          bw.flush();
          bw.close();
          return;
        }
      }
    }

    bw.write(String.valueOf(max-1));
    bw.flush();
    bw.close();
  }

  private static void bfs() {

    while (!q.isEmpty()) {

      int l = q.size();

      for (int i = 0; i < l; i++) {

        int[] start = q.poll();

        for (int j = 0; j < 4; j++) {
          int newX = start[0] + bx[j];
          int newY = start[1] + by[j];

          if (newX >= 0 && newY >= 0 && newX < n && newY < m && box[newX][newY] == 0) {
            q.offer(new int[]{newX, newY});
            box[newX][newY] = box[start[0]][start[1]] + 1;

            max = Math.max(max, box[newX][newY]);
          }
        }
      }
    }
  }
}
