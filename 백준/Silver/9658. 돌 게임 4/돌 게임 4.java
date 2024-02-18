import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    br.close();

    // n = 1일 때, 창영
    // 2, 상근
    // 3, 창영
    // 4, 상근
    // 5, 상근
    // 6, 상근 (상근 3, 창 1개, 상 1개, 창 1개)
    // 7, 상근 (상 4, 창 1, 상 1, 창 1)

    // 8, 창영
    // 9, 상근
    // 10, 창영
    // 11, 상근
    // 12, 상근
    // 13, 상근
    // 14, 상

    // 7로 나눴을 때, 나머지가 0, 2 면 창영

    bw.write((n % 7 == 1) || (n % 7 == 3) ? "CY" : "SK");
    bw.flush();
    bw.close();
  }
}
