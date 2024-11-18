import java.io.*;
import java.util.*;

class Main {

  static int[] X = {0, 0, -1, 1};
  static int[] Y = {-1, 1, 0, 0};
  static char[][] map;
  static Set<Character> set = new HashSet<>();
  static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] x = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
                .toArray();

    map = new char[x[0]][x[1]];

    for (int i = 0; i < x[0]; i++) {
      map[i] = br.readLine().toCharArray();
    }

    dfs(0, 0, 1);

    bw.write(String.valueOf(count));
    bw.flush();
    bw.close();
  }

  static void dfs(int x, int y, int depth) {

    set.add(map[x][y]);
    count = Math.max(count, depth);

    for (int i = 0; i < 4; i++) {
      int nx = X[i] + x;
      int ny = Y[i] + y;

      if (nx >= 0 && nx < map.length && ny >= 0 && ny < map[0].length &&
          !set.contains(map[nx][ny])) {
        dfs(nx, ny, depth+1);
        set.remove(map[nx][ny]);
      }
    }
  }
}
