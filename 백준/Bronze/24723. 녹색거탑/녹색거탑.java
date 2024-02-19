import java.util.*;
import java.io.*;

public class Main {

  static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    br.close();

    bw.write(String.format("%d", (int)Math.pow(2, n)));
    bw.flush();
    bw.close();
  }
}
