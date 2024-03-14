import java.io.*;
import java.util.*;

public class Main {

  static long a, b, c;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    a = Long.parseLong(st.nextToken());
    b = Long.parseLong(st.nextToken());
    c = Long.parseLong(st.nextToken());

    if (b >= c) {
      bw.write(String.valueOf(-1));
    } else {
      bw.write(String.valueOf(a/(c-b) + 1));
    }

    bw.flush();
    bw.close();
  }
}
