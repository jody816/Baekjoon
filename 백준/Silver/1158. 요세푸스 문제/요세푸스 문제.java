import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] x = br.readLine().split(" ");

    int n = Integer.parseInt(x[0]);
    int k = Integer.parseInt(x[1]);

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    int index = k-1;

    bw.write("<");

    while (list.size() != 1) {
      bw.write(list.get(index) + ", ");
      list.remove(index--);
      index += k;

      if (index >= list.size())
        index = index % list.size();
    }

    bw.write(list.get(0) + ">");
    bw.flush();
    bw.close();
  }
}
