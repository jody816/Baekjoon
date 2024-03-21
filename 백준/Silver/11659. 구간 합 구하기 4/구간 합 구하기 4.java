import java.io.*;
import java.util.*;

public class Main {

  static int n, m;
  static int[] arr;
  static int[] check;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    check = new int[n];
    check[0] = arr[0];
    for (int i = 1; i < n; i++) {
      check[i] = check[i-1] + arr[i];
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int f = Integer.parseInt(st.nextToken())-2;
      int e = Integer.parseInt(st.nextToken())-1;

      if (f < 0) {
        bw.write(check[e] + "\n");
      } else {
        bw.write((check[e] - check[f]) + "\n");
      }
    }

    bw.flush();
    bw.close();
  }
}
