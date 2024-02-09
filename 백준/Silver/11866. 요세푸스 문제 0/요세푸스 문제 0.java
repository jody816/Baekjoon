import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    bw.write("<");

    int index = k-1;
    while (list.size() != 1) {

      bw.write(list.get(index) + ", ");
      list.remove(index);

      index += k - 1;

      if (index >= list.size()) {
        index %= list.size();
      }
    }

    bw.write(list.get(0) + ">");
    bw.flush();
    bw.close();
  }
}