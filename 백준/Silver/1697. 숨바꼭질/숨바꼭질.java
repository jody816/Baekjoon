import java.util.*;
import java.io.*;

public class Main {
  static int n;
  static int k;
  static int[] map = new int[100001];
  static boolean[] visit = new boolean[100001];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

//    map = new int[k+1];
//    visit = new boolean[k+1];

    bfs(n);

    bw.write(String.valueOf(map[k]));
    bw.flush();
    bw.close();
  }

  private static void bfs(int n) {
    Queue<Integer> queue = new LinkedList<>();

    queue.add(n);
    visit[n] = true;

    while (!queue.isEmpty()) {

      int N = queue.poll();

      if (N+1 < 100001 && N+1 >= 0 && !visit[N+1] && map[N+1] == 0) {
        map[N+1] = map[N] + 1;
        queue.add(N+1);
      }

      if (N-1 < 100001 && N-1 >= 0 && !visit[N-1] && map[N-1] == 0) {
        map[N-1] = map[N] + 1;
        visit[N-1] = true;
        queue.add(N-1);
      }

      if (N*2 < 100001 && N*2 >= 0 && !visit[N*2] && map[N*2] == 0) {
        map[N*2] = map[N] + 1;
        visit[N*2] = true;
        queue.add(N*2);
      }
    }
  }
}
