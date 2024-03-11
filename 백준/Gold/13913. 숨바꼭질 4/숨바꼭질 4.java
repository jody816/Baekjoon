import java.util.*;
import java.io.*;

public class Main {

  static int n, k;
  static int[] map = new int[100001];
  static int[] check = new int[100001];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    bfs();

    bw.write(map[k] + "\n");

    Stack<Integer> s = new Stack<>();
    int back = k;
    s.push(k);
    while (back != n) {
      s.push(check[back]);
      back = check[back];
    }

    StringBuilder sb = new StringBuilder();
    while (!s.isEmpty()) {
      bw.write(s.pop() + " ");
    }

    bw.flush();
    bw.close();
  }

  static void bfs() {

    Queue<Integer> q = new LinkedList<>();
    q.offer(n);

    while (!q.isEmpty()) {

      int start = q.poll();

      if (start == k) {
        return;
      }

      for (int i = 0; i < 3; i++) {

        int x = start;

        switch (i) {
          case 0: x -= 1; break;
          case 1: x += 1; break;
          case 2: x *= 2; break;
        }

        if (x >= 0 && x < 100001 && map[x] == 0) {

          map[x] = map[start] + 1;
          check[x] = start;
          q.offer(x);
        }
      }
    }
  }
}
