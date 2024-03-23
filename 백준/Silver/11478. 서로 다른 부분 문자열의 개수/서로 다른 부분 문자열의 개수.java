import java.io.*;
import java.util.*;

public class Main {

  static String input;
  static Set<String> set = new HashSet<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    input = br.readLine();
    int l = input.length();

    for (int i = 0; i < l; i++) {
      for (int j = i+1; j <= l; j++) {
        set.add(input.substring(i, j));
      }
    }

    bw.write(String.valueOf(set.size()));
    bw.flush();
    bw.close();
  }
}
