import java.util.*;
import java.io.*;

public class Main {

  static int[] arr;
  static int n, m;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    arr = new int[m];

    dfs(1, 0);
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  static void dfs(int at, int depth) {

    if (depth == m) {
      for (int s : arr) {
        sb.append(s).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = at; i <= n; i++) {
      arr[depth] = i;
      dfs(i, depth+1);
    }
  }
}
