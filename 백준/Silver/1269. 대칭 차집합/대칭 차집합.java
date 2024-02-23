import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    Set<Integer> as = new HashSet<>();
    Set<Integer> bs = new HashSet<>();

    StringTokenizer aInput = new StringTokenizer(br.readLine());
    while (aInput.hasMoreTokens()) {
      as.add(Integer.valueOf(aInput.nextToken()));
    }

    StringTokenizer bInput = new StringTokenizer(br.readLine());
    while (bInput.hasMoreTokens()) {
      bs.add(Integer.valueOf(bInput.nextToken()));
    }

    int sum = as.size()+bs.size();
    for (int s : as) {

      if (bs.contains(s)) {
        sum--;
      }
    }
    for (int s : bs) {

      if (as.contains(s)) {
        sum--;
      }
    }

    bw.write(String.valueOf(sum));
    bw.flush();
    bw.close();
  }
}
