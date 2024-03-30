import java.util.*;
import java.io.*;

public class Main {

  static Set<Integer> set = new HashSet<>();
  static int n;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (int i = 1; i <= 20; i++) {
      set.add(i);
    }

    n = Integer.parseInt(br.readLine());

    Set<Integer> l = new HashSet<>();
    for (int i = 0; i < n; i++) {
      String[] x = br.readLine().split(" ");

      switch (x[0]) {
        case "add": l.add(Integer.parseInt(x[1])); break;
        case "remove": l.remove(Integer.parseInt(x[1])); break;
        case "check": if (l.contains(Integer.parseInt(x[1]))) bw.write(1 + "\n");
                      else bw.write(0 + "\n"); break;
        case "toggle": if (l.contains(Integer.parseInt(x[1]))) l.remove(Integer.parseInt(x[1]));
                        else l.add(Integer.parseInt(x[1])); break;
        case "all": l = new HashSet<>(set); break;
        case "empty": l = new HashSet<>(); break;
      }
    }
    
    bw.flush();
    bw.close();
  }
}
