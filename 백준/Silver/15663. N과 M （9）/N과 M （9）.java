import java.util.*;
import java.io.*;

public class Main {

  static int n, m;
  static int[] arr;
  static int[] check;
  static boolean[] visit;

  //static StringBuilder sb = new StringBuilder();
  static LinkedHashSet<String> set = new LinkedHashSet<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    arr = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt).toArray();
    Arrays.sort(arr);

    check = new int[m];
    visit = new boolean[n];

    dfs(0);

    for (String s : set) {
      bw.write(s);
    }
    bw.flush();
    bw.close();
  }

  static void dfs(int depth) {
    if (depth == m) {
      StringBuilder sb = new StringBuilder();

      for (int i : check) {
        sb.append(i).append(" ");
      }
      sb.append("\n");

      set.add(sb.toString());
      return;
    }

    for (int i = 0; i < n; i++) {
      if (!visit[i]) {
        check[depth] = arr[i];
        visit[i] = true;
        dfs(depth+1);
        visit[i] = false;
      }
    }
  }
}
