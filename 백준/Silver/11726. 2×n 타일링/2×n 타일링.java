import java.io.*;

public class Main {

  static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    int[] arr = new int[n+1];

    if (n == 1) {
      bw.write(String.valueOf(1));
      bw.flush();
      bw.close();
      return;
    }

    arr[1] = 1;
    arr[2] = 2;

    for (int i = 3; i <= n; i++) {
      arr[i] = (arr[i-2] + arr[i-1])%10007;
    }

    bw.write(String.valueOf(arr[n]));
    bw.flush();
    bw.close();
  }
}
