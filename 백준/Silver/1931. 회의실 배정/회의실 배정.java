import java.util.*;
import java.io.*;

public class Main {

  // 그리디 알고리즘 연습
  // 이차원 배열로 값을 받아주고
  // 오름차순으로 정렬
  // 뒤에서부터 세어 보면 되지 않을까...?

  static int n;
  static int[][] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());
    arr = new int[n][2];

    for (int i = 0; i < n; i++) {
      arr[i] = Arrays.stream(br.readLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();
    }

//    Arrays.sort(arr, (o1, o2) -> {
//      if (o1[0] == o2[1]) {
//        return o1[1] - o2[1];
//      } else {
//        return o1[0] - o2[0];
//      }
//    });
//
//    for (int i = 0; i < n; i++) {
//      System.out.println(arr[i][0] + " " + arr[i][1]);
//    }
//    System.out.println();

    Arrays.sort(arr, (o1, o2) -> {

      // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
      if(o1[1] == o2[1]) {
        return o1[0] - o2[0];
      }

      return o1[1] - o2[1];
    });

//    for (int i = 0; i < n; i++) {
//      System.out.println(arr[i][0] + " " + arr[i][1]);
//    }
//    System.out.println();

//    int count = 1;
//    int x = arr[n-1][0]-1;
//    for (int i = n-1; i >= 0; i--) {
//      if (x == arr[i][1]) {
//        count++;
//        x = arr[i][0]-1;
//      }
//    }

    int count = 0;
    int check = 0;
    for (int i = 0; i < n; i++) {
      if (check <= arr[i][0]) {
        check = arr[i][1];
        count++;
      }
    }

    bw.write(String.valueOf(count));
    bw.flush();
    bw.close();
  }
}
