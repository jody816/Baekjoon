import java.util.*;
import java.io.*;

public class Main {

  static class Box {
    int number;
    int[] box;

    public Box(int number, int[] box) {
      this.number = number;
      this.box = box;
    }
  }

  static int m;
  static int n;

  // 추가 입력
  static int h;

  static Queue<Box> queue = new LinkedList<>();

  static int[] bx = {0, 0, -1, 1};
  static int[] by = {-1, 1, 0, 0};

  // 추가
  static int[] bh = {-1, 1};

  static int max = 0;

  static Map<Integer, int[][]> boxes = new HashMap<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer input = new StringTokenizer(br.readLine());

    m = Integer.parseInt(input.nextToken());
    n = Integer.parseInt(input.nextToken());

    // 추가 입력
    h = Integer.parseInt(input.nextToken());

    for (int k = 0; k < h; k++) {
      int[][] box = new int[n][m];

      for (int i = 0; i < n; i++) {
        box[i] = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt).toArray();

        for (int j = 0; j < m; j++) {

          if (box[i][j] == 1) {
            Box b = new Box(k, new int[]{i, j});
            queue.offer(b);
            max = 1;
          }
        }
      }
      boxes.put(k, box);
    }

    bfs();

    for (int k = 0; k < h; k++) {
      int[][] box = boxes.get(k);

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (box[i][j] == 0) {
            bw.write(String.valueOf(-1));
            bw.flush();
            bw.close();
            return;
          }
        }
      }
    }

    bw.write(String.valueOf(max-1));
    bw.flush();
    bw.close();
  }

  private static void bfs() {

    while (!queue.isEmpty()) {
      int l = queue.size();

      for (int i = 0; i < l; i++) {

        Box b = queue.poll();

        int boxNum = b.number;
        int[] boxCoordinate = b.box;

        int[][] box = boxes.get(boxNum);

        for (int j = 0; j < 4; j++) {
          int newX = boxCoordinate[0] + bx[j];
          int newY = boxCoordinate[1] + by[j];

          if (newX >= 0 && newY >= 0 && newX < n && newY < m && box[newX][newY] == 0) {
            queue.offer(new Box(boxNum, new int[]{newX, newY}));
            box[newX][newY] = box[boxCoordinate[0]][boxCoordinate[1]] + 1;

            max = Math.max(max, box[newX][newY]);
          }
        }

        for (int k = 0;k < 2; k++) {
          int newH = boxNum + bh[k];

          if (newH >= 0 && newH < boxes.size()) {

            int[][] otherBox = boxes.get(newH);

            if (otherBox[boxCoordinate[0]][boxCoordinate[1]] == 0) {
              otherBox[boxCoordinate[0]][boxCoordinate[1]] = box[boxCoordinate[0]][boxCoordinate[1]] + 1;

              max = Math.max(max, otherBox[boxCoordinate[0]][boxCoordinate[1]]);
              queue.offer(new Box(newH, boxCoordinate));
            }
          }
        }
      }
    }
  }
}
