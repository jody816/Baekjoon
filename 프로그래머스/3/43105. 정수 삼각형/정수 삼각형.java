import java.util.*;

class Solution {
    
    static int[][] check;
    static int max = 0;
    
    public int solution(int[][] triangle) {

    check = new int[triangle.length][triangle.length];

    check[0][0] = triangle[0][0];



    for (int i = 1; i < triangle.length; i++) {

      check[i][0] = check[i-1][0] + triangle[i][0];
      check[i][i] = check[i-1][i-1] + triangle[i][i];

      for (int j = 1; j < i; j++) {

        check[i][j] = Math.max(check[i-1][j-1], check[i-1][j]) + triangle[i][j];
        max = Math.max(max, check[i][j]);
      }
    }

//    for (int k = 0; k < triangle.length; k++) {
//      for (int r = 0; r <= k; r++) {
//        System.out.print(check[k][r] + " ");
//      }
//      System.out.println();
//    }

    return max;
  }
}