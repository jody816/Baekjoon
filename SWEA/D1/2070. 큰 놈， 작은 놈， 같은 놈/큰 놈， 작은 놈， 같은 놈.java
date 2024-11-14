import java.util.*;
import java.io.*;

class Solution
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine().trim());

    for (int i = 1; i <= n; i++) {

      int[] arr = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        
      if (arr[0] > arr[1]) {
        bw.write("#" + i + " >" + "\n");
      } else if (arr[0] < arr[1]) {
        bw.write("#" + i + " <" + "\n");
      } else {
        bw.write("#" + i + " =" + "\n");
      }
    }

    bw.flush();
    bw.close();
  }
}
