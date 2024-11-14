import java.util.*;
import java.io.*;

class Solution
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (int i = 1; i <= 10; i++) {
      int n = Integer.parseInt(br.readLine().trim());

      int[] arr = Arrays.stream(br.readLine().trim().split(" "))
          .mapToInt(Integer::parseInt)
          .toArray();

      for (int j = 0; j < n; j++) {
          int minIdx = findMinIdx(arr);
          int maxIdx = findMaxIdx(arr);
          
          arr[minIdx]++;
          arr[maxIdx]--;
      }

      int min = Arrays.stream(arr).min().orElse(0);
      int max = Arrays.stream(arr).max().orElse(0);

      bw.write("#" + i + " " + (max-min) + "\n");
    }

    bw.flush();
    bw.close();
  }
    
    private static int findMinIdx(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    private static int findMaxIdx(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
