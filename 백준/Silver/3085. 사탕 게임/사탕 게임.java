import java.util.*;
import java.io.*;

public class Main {

  // 행끼리 바꾸고 탐색하고 돌려놔 주고
  // 열끼리 ...
  // 노가다..?

  static int N;
  static char[][] board;
  static int max = 1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    N = Integer.parseInt(br.readLine());

    board = new char[N][N];

    for (int i = 0; i < N; i++) {
      String x = br.readLine();

      for (int j = 0; j < x.length(); j++) {
        board[i][j] = x.charAt(j);
      }
    }
    br.close();

    // 가로
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N-1; j++) {
        // 바꿔야함
        swap(i, j, i, j+1);
        // 탐색
        search();
        // 돌려놓기
        swap(i, j+1, i, j);
      }
    }

    // 세로
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N-1; j++) {
        // 바꿔야함
        swap(j, i, j+1, i);
        // 탐색
        search();
        // 돌려놓기
        swap(j+1, i, j, i);
      }
    }

    bw.write(String.valueOf(max));
    bw.flush();
    bw.close();
  }
  private static void swap(int x1, int y1, int x2, int y2) {

    char temp = board[x1][y1];
    board[x1][y1] = board[x2][y2];
    board[x2][y2] = temp;
  }

  private static void search() {

    // 가로
    for (int i = 0; i < N; i++) {
      int count = 1;
      for (int j = 0; j < N-1; j++) {
        if (board[i][j] == board[i][j+1]) {
          count++;
          max = Math.max(count, max);
        } else {
          count = 1;
        }
      }
    }

    // 세로
    for (int i = 0; i < N; i++) {
      int count = 1;
      for (int j = 0; j < N-1; j++) {
        if (board[j][i] == board[j+1][i]) {
          count++;
          max = Math.max(count, max);
        } else {
          count = 1;
        }
      }
    }
  }
}