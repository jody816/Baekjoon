import java.util.*;
import java.io.*;

public class Main {

  static int[][] arr = new int[5][5];
  static int[] visit = new int[6];
  static Set<String> set = new HashSet<>();

  static int[] x = {-1, 1, 0, 0};
  static int[] y = {0, 0, -1, 1};

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (int i = 0; i < 5; i++) {
      arr[i] = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        dfs(i, j, 0);
      }
    }

    bw.write(String.valueOf(set.size()));
    bw.flush();
    bw.close();
  }

  static void dfs(int i, int j, int depth) {

    if (depth == 5) {
      visit[depth] = arr[i][j];
      StringBuilder sb = new StringBuilder();
      for (int value : visit) {
        sb.append(value);
      }
      set.add(sb.toString());
      return;
    }

    visit[depth] = arr[i][j];

    for (int k = 0; k < 4; k++) {
      int newX = i + x[k];
      int newY = j + y[k];

      if (newX >= 0 && newX < 5 && newY >= 0 && newY < 5) {
        dfs(newX, newY, depth+1);
      }
    }
  }
}
