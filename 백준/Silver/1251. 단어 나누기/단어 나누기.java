import java.io.*;
import java.util.*;

class Main {

  static List<String> list = new ArrayList<>();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String x = br.readLine();

    for (int i = 1; i < x.length(); i++) {
      for (int j = i+1; j < x.length(); j++) {
        StringBuilder a = new StringBuilder(x.substring(0, i));
        StringBuilder b = new StringBuilder(x.substring(i, j));
        StringBuilder c = new StringBuilder(x.substring(j));

        list.add(String.valueOf(a.reverse()) + b.reverse() + c.reverse());
      }
    }

    Collections.sort(list);

    bw.write(list.get(0));
    bw.flush();
    bw.close();
  }
}
