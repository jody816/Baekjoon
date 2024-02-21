import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine());

      int[] arr = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();

      long result = 0;
      int max = 0;
      for (int j = n-1; j >= 0; j--) {
        max = Math.max(max, arr[j]);

        if (max > arr[j]) {
          result += (max - arr[j]);
        }
      }

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }
}
