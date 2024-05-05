import java.util.*;

class Solution {
    static private int[] returnCoordinate(int number) {

    for (int i = 0; i < keypad.length; i++) {
      for (int j = 0; j < keypad[i].length; j++) {
        if (keypad[i][j].equals(String.valueOf(number))) {
          return new int[]{i, j};
        }
      }
    }

    return null;
  }

  static private int bfs(int[] thumb, int number) {

    check = new int[4][3];

    int[] findCoordinate = returnCoordinate(number);

    check[thumb[0]][thumb[1]] = 1;

    Queue<int[]> queue = new LinkedList<>();

    queue.offer(thumb);

    int distance = 0;

    while (!queue.isEmpty()) {

      int[] start = queue.poll();

      if (start[0] == findCoordinate[0] && start[1] == findCoordinate[1]) {
        distance = check[start[0]][start[1]];
        break;
      }

      for (int i = 0; i < 4; i++) {

        int newX = start[0] + x[i];
        int newY = start[1] + y[i];

        if (newX >= 0 && newX < 4 && newY >= 0 && newY < 3 && check[newX][newY] == 0) {

          queue.offer(new int[]{newX, newY});
          check[newX][newY] = check[start[0]][start[1]] + 1;
        }
      }
    }

    return distance;
  }
    
    // 키패드
  static String[][] keypad = {
      {"1", "2", "3"},
      {"4", "5", "6"},
      {"7", "8", "9"},
      {"*", "0", "#"}
  };

  // 거리를 재기 위한 배열
  static int[][] check;

  // 각 엄지손가락의 좌표 (초기)
  static int[] leftThumb = {3, 0};
  static int[] rightThumb = {3, 2};

  // 상하좌우
  static int[] x = {0, 0, 1, -1};
  static int[] y = {1, -1, 0, 0};

  // 결과 출력을 위한 스트링빌더
  static StringBuilder sb = new StringBuilder();
    
    public String solution(int[] numbers, String hand) {
       
        
        for (int i = 0; i < numbers.length; i++) {

      if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {

        sb.append("L");

        leftThumb = returnCoordinate(numbers[i]);

      } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {

        sb.append("R");

        rightThumb = returnCoordinate(numbers[i]);

      } else {

        int leftDistance = bfs(leftThumb, numbers[i]);
        int rightDistance = bfs(rightThumb, numbers[i]);

        if (leftDistance > rightDistance) {
          rightThumb = returnCoordinate(numbers[i]);
          sb.append("R");

        } else if (leftDistance < rightDistance) {
          leftThumb = returnCoordinate(numbers[i]);
          sb.append("L");

        } else {

          if (hand.equals("right")) {
            sb.append("R");
            rightThumb = returnCoordinate(numbers[i]);
          } else {
            sb.append("L");
            leftThumb = returnCoordinate(numbers[i]);
          }
        }
      }
    }

    return sb.toString();
    }
}