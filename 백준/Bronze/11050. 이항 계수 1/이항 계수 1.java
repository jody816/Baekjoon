import java.util.*;
import java.io.*;

public class Main {

  static int n, k;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    br.close();

    int N = 1;
    for (int i = n-k+1; i <= n; i++) {
      N *= i;
    }
    int K = 1;
    for (int i = 1; i <= k; i++) {
      K *= i;
    }
    bw.write(String.valueOf(N/K));
    bw.flush();
    bw.close();
  }
}
