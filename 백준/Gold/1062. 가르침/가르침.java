import java.io.*;
import java.util.*;

public class Main {

  static int n;
  static int k;
  static String[] word;
  static boolean[] visit = new boolean[26];
  static int max = Integer.MIN_VALUE;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());

    word = new String[n];
    if (k < 5) {
      bw.write("0");
      bw.flush();
      bw.close();
        return;
    } else if (k == 26) {
      bw.write(String.valueOf(n));
      bw.flush();
      bw.close();
        return;
    }

    visit['a' - 'a'] = true;
    visit['n' - 'a'] = true;
    visit['i' - 'a'] = true;
    visit['c' - 'a'] = true;
    visit['t' - 'a'] = true;

    for (int i = 0; i < n; i++) {
      word[i] = br.readLine().replaceAll("anta|tica", "");
    }

    dfs(0, 0);

    bw.write(String.valueOf(max));
    bw.flush();
    bw.close();
  }

  static void dfs(int idx, int count) {

    if (count == k-5) {
      int c = 0;
      O: for (int i = 0; i < n; i++) {

        char[] x = word[i].toCharArray();
        for (int j = 0; j < word[i].length(); j++) {
          if (!visit[x[j] - 'a']) {
            continue O;
          }
        }

        c++;
      }

      max = Math.max(max, c);
      return;
    }

    for (int i = idx; i < 26; i++) {
      if (!visit[i]) {
        visit[i] = true;
        dfs(i, count + 1);
        visit[i] = false;
      }
    }
  }
}
