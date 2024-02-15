import java.util.*;
import java.io.*;

public class Main {
  static long[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());
      arr = new long[101];
      bw.write(dp(n) + "\n");
    }
    bw.flush();
    bw.close();
  }
  static long dp(int n) {

    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 1;
    arr[4] = 2;
    arr[5] = 2;
    arr[6] = 3;
    arr[7] = 4;
    arr[8] = 5;
    arr[9] = 7;
    arr[10] = 9;

    if (n > 10 && arr[n] == 0) {
      for (int i = 11; i <= n; i++) {
        arr[i] = arr[i-1] + arr[i-5];
      }
    }

    return arr[n];
  }
}
