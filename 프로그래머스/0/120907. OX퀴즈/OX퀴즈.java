import java.util.*;

class Solution {
    
  static String[] result;

  public String[] solution(String[] quiz) {

    result = new String[quiz.length];

    int idx = 0;
    for (String s : quiz) {

      String[] a = s.split(" = ");

      if (a[0].contains("+")) {
        int[] arr = Arrays.stream(a[0].split(" \\+ "))
            .mapToInt(Integer::parseInt)
            .toArray();

        if (arr[0] + arr[1] == Integer.parseInt(a[1])) result[idx++] = "O";
        else result[idx++] = "X";
      } else {
        int[] arr = Arrays.stream(a[0].split(" - "))
            .mapToInt(Integer::parseInt)
            .toArray();

        if (arr[0] - arr[1] == Integer.parseInt(a[1])) result[idx++] = "O";
        else result[idx++] = "X";
      }
    }

    return result;
  }
}