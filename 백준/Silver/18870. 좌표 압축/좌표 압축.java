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

    int[] sortedArr = arr.clone();
    Arrays.sort(sortedArr);

    int rank = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int j : sortedArr) {

      if (!map.containsKey(j)) {
        map.put(j, rank++);
      }
    }

    for (int i = 0; i < n; i++) {
      bw.write(map.get(arr[i]) + " ");
    }
    bw.flush();
    bw.close();
  }
}
