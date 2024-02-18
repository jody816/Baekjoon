import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    br.close();

    // 홀수면 상근이가 짐, 짝수면 창영이가 짐
    bw.write(n % 2 == 0 ? "SK" : "CY");
    bw.flush();
    bw.close();
  }
}
