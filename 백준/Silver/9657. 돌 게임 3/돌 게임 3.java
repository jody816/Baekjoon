import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    br.close();

    // n = 1일 때, 상근
    // 2, 창영
    // 3, 상근
    // 4, 상근
    // 5, 상근 (상근이 3개, 창영 1개, 상근 1개)
    // 6, 상근 (4, 1, 1)
    // 7, 창영

    // 8, 상근
    // 9, 창영
    // 10, 상근
    // 11, 상근
    // 12, 상근
    // 13, 상근
    // 14, 창영

    // 7로 나눴을 때, 나머지가 0, 2 면 창영 (false)

    bw.write((n % 7 == 0) || (n % 7 == 2) ? "CY" : "SK");
    bw.flush();
    bw.close();
  }
}
