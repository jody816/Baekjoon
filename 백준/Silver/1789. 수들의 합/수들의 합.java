import java.io.*;
import java.util.*;

public class Main {

  static long n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Long.parseLong(br.readLine());

    long sum = 0;
    int count = 0;

    for (int i = 1; ; i++) {
      if (sum > n) {
        break;
      }

      sum += i;
      count++;
    }

    bw.write(String.valueOf(count-1));
    bw.flush();
    bw.close();
  }
}