import java.io.IOException;
import java.util.*;

class Solution{

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {

      int length = sc.nextInt();
      int[] building = new int[length];

      for (int j = 0; j < length; j++) {
        building[j] = sc.nextInt();
      }

      int total = 0;

      for (int j = 2; j < length-2; j++) {
        int maxView = 0;

        if (building[j] <= building[j-1] || building[j] <= building[j-2] ||
            building[j] <= building[j+1] || building[j] <= building[j+2]) {
          continue;
        }

        for (int k = 1; k < 3; k++) {
          if (maxView < building[j+k]) {
            maxView = building[j+k];
          }

          if (maxView < building[j-k]) {
            maxView = building[j-k];
          }
        }
        
        total += (building[j] - maxView);
      }

      System.out.println("#" + i + " " + total);
    }
  }
}
