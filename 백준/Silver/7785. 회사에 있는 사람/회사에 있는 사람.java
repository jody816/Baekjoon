import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    Map<String, String> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      String name = st.nextToken();
      String what = st.nextToken();

      if (!map.containsKey(name) && what.equals("enter")) {
        map.put(name, what);
      } else {
        map.remove(name);
      }
    }

    ArrayList<String> list = new ArrayList<>(map.keySet());
    Collections.sort(list, Collections.reverseOrder());
    for (int i = 0; i < list.size(); i++) {
      bw.write(list.get(i) + "\n");
    }
    bw.flush();
    bw.close();
  }
}
