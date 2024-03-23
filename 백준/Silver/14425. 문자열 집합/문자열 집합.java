import java.io.*;
import java.util.*;

public class Main {

  static int n, m;
  static Set<String> set = new HashSet<>();
  static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    for (int i = 0; i < n; i++) {
      set.add(br.readLine());
    }
    
    for (int i = 0; i < m; i++) {
      String x = br.readLine();
      if (set.contains(x)) {
        count++;
      }
    }

    bw.write(String.valueOf(count));
    bw.flush();
    bw.close();
  }
}