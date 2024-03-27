import java.util.*;
import java.io.*;

public class Main {
  static int n;
  static int[] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      set.add(arr[i]);
    }

    int[] result = new int[set.size()];
    int idx = 0;
    for (int s : set) {
      result[idx++] = s;
    }

    Arrays.sort(result);
    for (int i : result) {
      bw.write(i + " ");
    }
    bw.flush();
    bw.close();
  }
}
