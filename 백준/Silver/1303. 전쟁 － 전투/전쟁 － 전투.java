import java.util.*;
import java.io.*;

public class Main {

  static int n, m;
  static String[][] map;
  static boolean[][] visit;
  static int b = 0, B = 0, w = 0, W = 0;
  static int[] x = {-1, 1, 0, 0};
  static int[] y = {0, 0, -1, 1};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    map = new String[m][n];
    for (int i = 0; i < m; i++) {
      map[i] = br.readLine().split("");
    }

    visit = new boolean[m][n];

    for (int i  = 0; i < m; i++) {
      for (int j  = 0; j < n; j++) {
        if (!visit[i][j]) {
          dfs(i, j, map[i][j]);

          if (map[i][j].equals("B")) {
            B += Math.pow(b, 2);
            b = 0;
          } else {
            W += Math.pow(w, 2);
            w = 0;
          }
        }
      }
    }

    bw.write(W + " " + B);
    bw.flush();
    bw.close();
  }

  static void dfs(int i, int j, String who) {

    visit[i][j] = true;
    if (who.equals("B")) {
      b++;
    } else {
      w++;
    }

    for (int k = 0; k < 4; k++) {
      int newX = i + x[k];
      int newY = j + y[k];

      if (checkRange(newX, newY) && !visit[newX][newY] && who.equals(map[newX][newY])) {
        dfs(newX, newY, who);
      }
    }
  }

  static boolean checkRange(int newX, int newY) {
    return newX >= 0 && newX < m && newY >= 0 && newY < n;
  }
}
