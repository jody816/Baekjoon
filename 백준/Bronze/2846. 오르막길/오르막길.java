import java.io.*;
import java.util.*;

public class Main {
  static int n;
  static int[] arr;
  static int max = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();
    int idx;
    for (int i = 1; i < n; i++) {

      if (arr[i-1] < arr[i]) {
        idx = i-1;
        for (int j = i+1; j < n; j++) {
          if (arr[j-1] >= arr[j]) {
            max = Math.max(max, arr[j-1] - arr[idx]);
            i = j-1;
            break;
          } else if (j == n-1 && arr[j-1] < arr[j]) {
            max = Math.max(max, arr[j] - arr[idx]);
            i = j-1;
            break;
          }
        }
      }
    }

    bw.write(String.valueOf(max));
    bw.flush();
    bw.close();
  }
}
