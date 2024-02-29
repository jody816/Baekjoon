import java.util.*;
import java.io.*;

public class Main {

  static boolean[] visit;
  static int[] arr;

  static int n, m;

  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    visit = new boolean[n];
    arr = new int[m];

    dfs(0);
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  static void dfs(int depth) {

    if (depth == m) {
      for (int s : arr) {
        sb.append(s).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = 0; i < n; i++) {
      if (!visit[i]) {
        visit[i] = true;
        arr[depth] = i + 1;
        dfs(depth + 1);
        visit[i] = false;
      }
    }
  }
}
