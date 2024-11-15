import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class Solution
{
  static int result;
  static int[][] m;

  public static void main(String[] args) throws Exception
  {
    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {

      int n = sc.nextInt();

      result = 0;
      m = new int[100][100];

      for (int r = 0; r < 100; r++) {
        for (int j = 0; j < 100; j++) {
          m[r][j] = sc.nextInt();
        }
      }

      for (int j = 0; j < 100; j++) {
        int sum = Arrays.stream(m[j]).sum();

        int sum2 = 0;
        for (int r = 0; r < 100; r++) {
          sum2 += m[r][j];
        }

        result = Math.max(result, Math.max(sum2, sum));
      }

      int a = 0, b = 0;
      for (int j = 0; j < 100; j++) {
        a += m[j][j];
        b += m[j][99-j];
      }

      result = Math.max(a, Math.max(b, result));

      System.out.println("#" + i + " " + result);

      m = null;
    }
  }
}
