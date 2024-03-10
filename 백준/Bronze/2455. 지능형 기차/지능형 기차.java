import java.util.*;
import java.io.*;

public class Main {

  static int max = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int people = 0;

    for (int i = 0; i < 4; i++) {

      StringTokenizer st = new StringTokenizer(br.readLine());

      int down = Integer.parseInt(st.nextToken());
      int ride = Integer.parseInt(st.nextToken());

      if (i == 0) {
        people += ride;
        max = Math.max(max, people);
        continue;
      }

      people += (ride - down);
      max = Math.max(max, people);
    }

    bw.write(String.valueOf(max));
    bw.flush();
    bw.close();
  }
}
