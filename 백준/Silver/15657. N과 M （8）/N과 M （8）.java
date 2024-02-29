import java.util.*;
import java.io.*;

public class Main {

  static int n, m;
  static int[] arr;
  static int[] check;
  //static boolean[] visit;

  static StringBuilder sb = new StringBuilder();

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
    //visit = new boolean[n];

    dfs(0, 0);

    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }

  static void dfs(int at, int depth) {
    if (depth == m) {
      for (int i : check) {
        sb.append(i).append(" ");
      }
      sb.append("\n");
      return;
    }

    for (int i = at; i < n; i++) {
      check[depth] = arr[i];
      dfs(i, depth+1);
    }
  }
}
