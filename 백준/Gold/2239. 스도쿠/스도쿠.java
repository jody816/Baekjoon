import java.io.*;
import java.util.*;

public class Main {

  static int[][] board = new int[9][9];
  static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
  static StringBuilder sb;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 9; i++) {
      board[i] = Arrays.stream(br.readLine().split(""))
          .mapToInt(Integer::parseInt).toArray();
    }

    for (int i = 0; i < 9; i++) {

      list.add(new ArrayList<>());

      for (int j = 1; j <= 9; j++) {
        list.get(i).add(j);
      }

      for (int k : board[i]) {
        if (list.get(i).contains(k)) {
          list.get(i).remove(Integer.valueOf(k));
        }
      }
    }

//    for (int i = 0; i < 9; i++) {
//      System.out.println(list.get(i));
//    }

    go2(0, 0);
  }

  static void go2 (int row, int col) {

    if (col == 9) {
      go2(row+1, 0);
      return;
    }

    if (row == 9) {
      sb = new StringBuilder();
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {

//          if (board[i][j] == 0) {
//            sb = new StringBuilder();
//            return;
//          }
          sb.append(board[i][j]);
        }
        sb.append("\n");
      }

      System.out.print(sb.toString());
      System.exit(0);
    }

    if (board[row][col] == 0) {
      for (int i = 0; i < list.get(row).size(); i++) {
        if (check(row, col, list.get(row).get(i))) {
          board[row][col] = list.get(row).get(i);
          go2(row, col+1);
        }
      }
      board[row][col] = 0;
      return;
    }

    go2(row, col+1);
  }



  // 실패
  static void go(int row, int col) {

    if (col == 9) {
      for (int i = 0; i < 9; i++) {
        sb.append(board[row][i]);
      }

      sb.append("\n");
    }

    for (int i = row; i < 9; i++) {

      for (int j = col; j < 9; j++) {

        if (board[i][j] == 0) {

          for (int k = 1; k <= 9; k++) {

            if (check(i, j, k)) {
              board[i][j] = k;
              go(i, j+1);
            }

            //board[i][j] = 0;
          }

        }
      }

//      for (int k = 0; k < list.get(i).size(); k++) {
//
//        for (int j = col; j < 9; j++) {
//
//          if (board[i][j] == 0 && check(i, j, list.get(i).get(k))) {
//            board[i][j] = list.get(i).get(k);
//            go(row, col+1);
//            //board[i][j] = 0;
//          }
//        }
//      }

    }
  }

  static boolean check(int row, int col, int value) {

    // 행 체크
    for (int i = 0; i < 9; i++) {
      if (board[i][col] == value) {
        return false;
      }
    }

    // 열 체크
    for (int i = 0; i < 9; i++) {

      if (board[row][i] == value) {

        // 겹치는 값이 있으면 false 반환
        return false;
      }
    }

    // 바운더리 체크
//    int r = (row / 3) + 1;
//    int c = (col / 3);
//
//    for (int i = r-1; i < r*3; i++) {
//      for (int j = c*3; j < c*3+3; j++) {
//        if (board[i][j] == value) {
//          return false;
//        }
//      }
//    }
    
    // 바운더리 체크
    int r = (row / 3) * 3;
    int c = (col / 3) * 3;
    
    // 요래 해주면 3x3 으로 체크 가능

    for (int i = r; i < r+3; i++) {
      for (int j = c; j < c+3; j++) {
        if (board[i][j] == value) {
          return false;
        }
      }
    }

    return true;
  }
}
