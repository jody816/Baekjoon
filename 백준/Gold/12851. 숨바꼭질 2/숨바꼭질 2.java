import java.util.*;
import java.io.*;

public class Main {

  static int n, k;
  static int[] map = new int[100001];
  static int min = Integer.MAX_VALUE, way = 0;
  static Queue<Integer> q = new LinkedList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    bfs(n);

    bw.write(min + "\n" + way);
    bw.flush();
    bw.close();
  }

  static void bfs(int start) {

    q.offer(start);

    while (!q.isEmpty()) {

      int s = q.poll();

      if (s == k) {
        min = Math.min(min, map[s]);
        way++;
        continue;
      }

      int back = s-1;
      int go = s+1;
      int jump = s*2;

      if (valid(back)) {
        if (map[back] != 0 && map[back] >= map[s] + 1) {
          map[back] = map[s] + 1;
          q.offer(back);
        } else if (map[back] == 0){
          map[back] = map[s] + 1;
          q.offer(back);
        }
      }

      if (valid(go)) {
        if (map[go] != 0 && map[go] >= map[s] + 1) {
          map[go] = map[s] + 1;
          q.offer(go);
        } else if (map[go] == 0){
          map[go] = map[s] + 1;
          q.offer(go);
        }
      }

      if (valid(jump)) {
        if (map[jump] != 0 && map[jump] >= map[s] + 1) {
          map[jump] = map[s] + 1;
          q.offer(jump);
        } else if (map[jump] == 0){
          map[jump] = map[s] + 1;
          q.offer(jump);
        }
      }
    }
  }

  static boolean valid(int w) {
    return w >= 0 && w < 100001;
  }
}
