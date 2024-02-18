import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static Boolean[] check = new Boolean[1001];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    // 상근이가 1개의 돌을 가져갈 수 있어서
    check[1] = true;

    // 상근이가 1개를 가져가면 창영이가 남은 1개를 가져가기 때문에
    check[2] = false;

    // 상근이가 3개를 가져가면 되니까
    check[3] = true;

    // 상근이가 1개든 3개든 가져가면 창영이가 나머지를 취할 수 있기에
    check[4] = false;

    // 상근이가 이기려면 처음에 1개를 가져가고, 다시 턴이 왔을 때 이길 수 잇다
    check[5] = true;

    // t, f, t, f, t, f, .....

    for (int i = 6; i < 1001; i++) {
      if (i % 2 == 0) {
        check[i] = false;
      } else {
        check[i] = true;
      }
    }

    if (check[n]) {
      bw.write("SK");
    } else {
      bw.write("CY");
    }

    bw.flush();
    bw.close();
  }
}
