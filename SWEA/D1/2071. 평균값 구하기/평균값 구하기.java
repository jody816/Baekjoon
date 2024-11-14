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

      double sum = Arrays.stream(br.readLine().trim()
          .split(" "))
          .mapToInt(Integer::parseInt)
          .sum();

      bw.write("#" + i + " " + (int) Math.round(sum /10) + "\n");
    }

    bw.flush();
    bw.close();
  }
}
