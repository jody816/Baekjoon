import java.util.*;
import java.io.*;

class Solution
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = Arrays.stream(br.readLine().trim().split("")).mapToInt(Integer::parseInt).toArray();

    bw.write(String.valueOf(Arrays.stream(arr).sum()));
    bw.flush();
    bw.close();
  }
}
