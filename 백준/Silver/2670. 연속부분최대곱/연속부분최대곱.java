import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static double[] arr;
  static double max = 0;
  static double[] check;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = new double[n];
    check = new double[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Double.parseDouble(br.readLine());
    }

    check[0] = arr[0];
    for (int i = 1; i < n; i++) {
      check[i] = Math.max(arr[i], check[i-1] * arr[i]);
      max = Math.max(max, check[i]);
    }
    
    bw.write(String.format("%.3f", max));
    bw.flush();
    bw.close();
  }
}
