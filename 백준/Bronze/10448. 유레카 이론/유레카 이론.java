import java.util.*;
import java.io.*;

public class Main {
  static int n;
  static int[] arr = new int[45];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    for (int i = 1; i <= 44; i++) {
      arr[i] = i*(i+1)/2;
    }

    for (int i = 0; i < n; i++) {
      int k = Integer.parseInt(br.readLine());

      bw.write(search(k) + "\n");
    }

    bw.flush();
    bw.close();
  }

  static int search(int k) {

    for (int i = 1; i < 45; i++) {
      for (int j = 1; j < 45; j++) {
        for (int r = 1; r < 45; r++) {
          if (k == (arr[i]+arr[j]+arr[r])) {
            return 1;
          }
        }
      }
    }

    return 0;
  }
}
