// 2차원 배열을 그래프로 표현해 BFS나 DFS로 순회하는 문제
import java.util.*;
import java.io.*;

public class Main {

  static int[][] board;
  static boolean[][] visited;

  // 십자 방향으로 탐색하기 위해
  static int[] dx = {0, 0, -1, 1};
  static int[] dy = {-1, 1, 0, 0};

  static int count = 1;
  static Queue<Integer> queue = new LinkedList<>();
  static ArrayList<Integer> result = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    board = new int[n][n];
    visited = new boolean[n][n];

    for (int i = 0; i < n; i++) {

      String[] x = br.readLine().split("");

      for (int j = 0; j < n; j++) {
        board[i][j] = Integer.parseInt(x[j]);
      }
    }
    br.close();

    for (int x = 0; x < n; x++) {
      for (int y = 0; y < n; y++) {

        // 1이고 false 여야 탐색
        if (board[x][y] == 1 && !visited[x][y]) {

          bfs(x, y);
          result.add(count);
          count = 1;
        }
      }
    }

    Collections.sort(result);

    bw.write(result.size() + "\n");
    for (int i : result) {
      bw.write(i + "\n");
    }
    bw.flush();
    bw.close();
  }

  private static void bfs(int x, int y) {

    visited[x][y] = true;
    queue.add(x);
    queue.add(y);

    while (!queue.isEmpty()) {
      int xx = queue.poll();
      int yy = queue.poll();
      
      // 4 방향 탐색
      for (int i = 0; i < 4; i++) {
        int newX = dx[i] + xx;
        int newY = dy[i] + yy;

        if (newX >= 0 && newY >= 0 && newX < board.length && newY < board.length
            && !visited[newX][newY] && board[newX][newY] == 1) {

          count++;
          visited[newX][newY] = true;
          queue.offer(newX);
          queue.offer(newY);
        }
      }
    }
  }
}
