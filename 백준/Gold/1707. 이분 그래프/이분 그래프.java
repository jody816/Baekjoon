import java.io.*;
import java.util.*;

public class Main {

  static int n, V, E;
  static List<List<Integer>> graph;
  static boolean isCorrect;
  static int[] check;
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {

      StringTokenizer st = new StringTokenizer(br.readLine());
      V = Integer.parseInt(st.nextToken());
      E = Integer.parseInt(st.nextToken());

      graph = new ArrayList<>();
      check = new int[V+1];

      for (int j = 0; j <= V; j++) {
        graph.add(new ArrayList<>());
      }

      for (int j = 0; j < E; j++) {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        graph.get(a).add(b);
        graph.get(b).add(a);
      }

      isCorrect = true;

      for (int j = 1; j <= V; j++) {

        if (check[j] == 0) {
          dfs(j, 1);
        }
      }

      if (isCorrect) {
        bw.write("YES\n");
      } else {
        bw.write("NO\n");
      }
    }

    bw.flush();
    bw.close();
  }

  private static void dfs(int ver, int color) {

    check[ver] = color;

    List<Integer> x = graph.get(ver);

    for (int i : x) {

      if (check[i] == color) {
        isCorrect = false;
        return;
      }

      if (check[i] == 0) {
        dfs(i, -color);
      }
    }
  }
}
