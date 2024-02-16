import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    bw.write(String.valueOf(factorial(n)));
    bw.flush();
    bw.close();
  }

  static long factorial(int n) {

    if (n <= 1) {
      return 1;
    }

    return n * factorial(n-1);
  }
}
