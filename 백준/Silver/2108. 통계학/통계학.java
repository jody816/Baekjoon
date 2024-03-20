import java.io.*;
import java.util.*;

public class Main {

  static int n;
  static int[] arr;
  static int[] check = new int[8001];
  static int max = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    double sum = 0;

    n = Integer.parseInt(br.readLine());

    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      sum += arr[i];

//      if (arr[i] >= 0) {
//
//      } else {
//        check[-arr[i]]++;
//        max = Math.max(check[-arr[i]], max);
//      }
      check[arr[i]+4000]++;
      max = Math.max(check[arr[i]+4000], max);
    }

    Arrays.sort(arr);

    bw.write(Math.round(sum/n) + "\n");
    bw.write(arr[(n-1)/2] + "\n");

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < check.length; i++) {
      if (check[i] == max) {
        list.add(i-4000);
      }

      if (list.size() > 1) {
        break;
      }
    }
    bw.write(list.get(list.size()-1) + "\n");

    bw.write(String.valueOf(arr[n-1] - arr[0]));
    bw.flush();
    bw.close();
  }
}
