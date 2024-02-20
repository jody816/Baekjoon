import java.util.*;
import java.io.*;

public class Main {

  static int n, m;
  static int[] board = new int[101];
  static int[] check = new int[101];
  static Queue<Integer> q = new LinkedList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    for (int i = 1; i < 101; i++) {
      board[i] = i;
    }

    for (int i = 0; i < n; i++) {
      StringTokenizer b = new StringTokenizer(br.readLine());

      int idx = Integer.parseInt(b.nextToken());
      int newIdx = Integer.parseInt(b.nextToken());

      board[idx] = newIdx;
    }

    for (int i = 0; i < m; i++) {
      StringTokenizer b = new StringTokenizer(br.readLine());

      int idx = Integer.parseInt(b.nextToken());
      int newIdx = Integer.parseInt(b.nextToken());

      board[idx] = newIdx;
    }

    int result = bfs(1);

//    for (int i = 1; i < 101; i++) {
//      System.out.print(check[i] + " ");
//      if (i%10 == 0) {
//        System.out.println();
//      }
//    }

    bw.write(String.valueOf(result));
    bw.flush();
    bw.close();
  }

  static int bfs(int s) {
    q.offer(s);

    while (!q.isEmpty()) {

      int start = q.poll();

      for (int newLocation = start+1; newLocation <= start+6; newLocation++) {

        if (check[board[newLocation]] == 0) {
          check[board[newLocation]] = check[start]+1;
          q.offer(board[newLocation]);
        }

        if (newLocation == 100) {
          return check[board[newLocation]];
        }
      }
    }

    return 0;
  }
}
