import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] x = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();

    Arrays.sort(x);

    bw.write(String.valueOf(x[0] * x[x.length - 1]));
    bw.flush();
    bw.close();
  }
}
