import java.util.*;
import java.io.*;

public class Main {

  static int n;
  static int m;
  static char[][] board;
  static int min = 32;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    board = new char[n][m];

    for (int i = 0; i < n; i++) {
      String x = br.readLine();

      for (int j = 0; j < x.length(); j++) {
        board[i][j] = x.charAt(j);
      }
    }


    int a = n - 8 + 1;
    int b = m - 8 + 1;

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        for (int o = 0; o < 2; o++) {

          char first;
          if (o == 0) {
            first = 'B';
          } else {
            first = 'W';
          }

          int count = 0;

          for (int k = i; k < i+8; k++) {
            for (int r = j; r < j+8; r++) {

              if (first != board[k][r]) {
                count++;
              }

              // 한 칸씩 체크 하기 위해서 ㅇㅇ
              if (first == 'B') {
                first = 'W';
              } else {
                first = 'B';
              }
            }

            // 한 번 더 해줘야 함
            if (first == 'B') {
              first = 'W';
            } else {
              first = 'B';
            }
          }

          if (count == 0) {
            bw.write(String.valueOf(0));
            bw.flush();
            bw.close();
            return;
          }

          // 최소값으로 초기화
          min = Math.min(min, count);
        }
      }
    }

    bw.write(String.valueOf(min));
    bw.flush();
    bw.close();
  }
}
