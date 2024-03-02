import java.util.*;
import java.io.*;

public class Main {

  static int n, m;
  static int[] arr;
  static int[] check;
  static LinkedHashSet<String> set = new LinkedHashSet<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    check = new int[m];

    arr = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();

    Arrays.sort(arr);

    dfs(0, 0);

    for (String s : set) {
      bw.write(s);
    }
    bw.flush();
    bw.close();
  }

  static void dfs(int at, int depth) {
    if (depth == m) {
      StringBuilder sb = new StringBuilder();

      for (int j : check) {
        sb.append(j).append(" ");
      }
      sb.append("\n");
      set.add(sb.toString());
      return;
    }

    for (int i = at; i < n; i++) {
      check[depth] = arr[i];
      dfs(i, depth+1);
    }
  }
}
