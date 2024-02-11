import java.util.*;
import java.io.*;

public class Main {

  static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    n = Integer.parseInt(br.readLine());

    int[] array = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();
    br.close();

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 1; i <= n; i++)
      list.add(i);

    while (list.size() != 1) {

      int c = list.get(0);

      bw.write(c + " ");

      int next = array[c-1];

      list.remove(0);

      if (next > 0) {

        for (int i = 1; i < next; i++) {
          list.add(list.remove(0));
        }
      } else {
        for (int i = 0; i > next; i--) {
          list.add(0, list.remove(list.size()-1));
        }
      }
    }

    bw.write(String.valueOf(list.get(0)));
    bw.flush();
    bw.close();
  }
}
