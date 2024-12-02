import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] arr = br.readLine().split("-");

    int sum = Arrays.stream(Arrays.stream(arr[0].split("[+]"))
        .mapToInt(Integer::parseInt)
        .toArray()).sum();

    for (int i = 1; i < arr.length; i++) {

      sum -= Arrays.stream(Arrays.stream(arr[i].split("[+]"))
          .mapToInt(Integer::parseInt)
          .toArray()).sum();
    }

    bw.write(String.valueOf(sum));
    bw.flush();
  }
}
