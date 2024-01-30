import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder result = new StringBuilder();

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      while (st.hasMoreTokens()) {
        StringBuilder sb = new StringBuilder(st.nextToken());
        result.append(sb.reverse()).append(" ");
      }
      result.append("\n");
    }

    br.close();
    bw.write(result.toString());
    bw.close();
  }
}
