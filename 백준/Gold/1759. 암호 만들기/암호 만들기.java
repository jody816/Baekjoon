import java.util.*;
import java.io.*;

public class Main {

  static int l, c;
  static String[] vowel = {"a", "e", "i", "o", "u"};
  static String[] arr;
  static String[] check;
  static ArrayList<String> list = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    l = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    check = new String[l];

    arr = br.readLine().split(" ");

    Arrays.sort(arr);

    dfs(0, 0);

    for (String s : list) {
      bw.write(s);
    }
    bw.flush();
    bw.close();
  }

  static void dfs(int at, int depth) {
    if (depth == l) {

      StringBuilder sb = new StringBuilder();
      int vCount = 0, count = 0;

      O: for (String s : check) {

        for (String t : vowel) {

          if (s.equals(t)) {
            vCount++;
            sb.append(s);
            continue O;
          }

        }

        count++;
        sb.append(s);
      }
      sb.append("\n");

      if (sb.length() == l+1 && count >= 2 && vCount >= 1) {
        list.add(sb.toString());
      }

      return;
    }

    for (int i = at; i < c; i++) {
      check[depth] = arr[i];
      dfs(i+1, depth+1);
    }
  }
}
