import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    int[] arr = new int[t];

    for (int i = 0; i < t; i++) {
      int x = Integer.parseInt(br.readLine());
      arr[i] = x;
    }

    int gcd = 0;
    for (int i = 1; i < t; i++) {
      int num = arr[i] - arr[i-1];
      gcd = findGCD(num, gcd);
    }

    bw.write(((arr[t-1]-arr[0]) / gcd)+1-(t) + "");
    bw.flush();
    bw.close();
  }

  static private int findGCD(int a, int b) {
    while (b != 0) {
      int c = a%b;
      a = b;
      b = c;
    }
    return a;
  }
}
