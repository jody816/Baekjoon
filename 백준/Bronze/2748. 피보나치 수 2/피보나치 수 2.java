import java.io.*;

public class Main {

  static int n;
  static long[] arr = new long[91];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 2;

    for (int i = 4; i <= 90; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }

    bw.write(String.valueOf(arr[n]));
    bw.flush();
    bw.close();
  }
}
