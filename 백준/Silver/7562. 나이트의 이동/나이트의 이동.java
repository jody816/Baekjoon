import java.util.*;
import java.io.*;

public class Main {

  // bfs

  static int T;

  // 체스판의 한 변의 길이
  static int I;

  // 나이트가 현재 있는 칸
  static int[] now;

  // 나이트가 이동하려고 하는 칸
  static int[] goal;

  // 체스판
  static int[][] board;
  static boolean [][] visit;

  // 방향
  static int[] bx = {2, 2, -2, -2, -1, 1, -1, 1};
  static int[] by = {-1, 1, -1, 1, 2, 2, -2, -2};

  static Queue<int[]> q;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {

      I = Integer.parseInt(br.readLine());

      now = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();

      goal = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();

      bfs();

      bw.write((board[goal[0]][goal[1]]) + "\n");
    }

    bw.flush();
    bw.close();
  }

  private static void bfs() {
    board = new int[I][I];
    visit = new boolean[I][I];

    visit[now[0]][now[1]] = true;

    q = new LinkedList<>();

    q.offer(now);

    while (!q.isEmpty()) {

      int[] n = q.poll();

      for (int i = 0; i < 8; i++) {
        int newX = n[0] + bx[i];
        int newY = n[1] + by[i];

        if (newX >= 0 && newY >= 0 && newX < I && newY < I) {
          if (!visit[newX][newY]) {
            board[newX][newY] = board[n[0]][n[1]] + 1;
            visit[newX][newY] = true;
            q.offer(new int[]{newX, newY});
          }
        }
      }
    }
  }
}
