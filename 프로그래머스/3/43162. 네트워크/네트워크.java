import java.util.*;

class Solution {

  static boolean[] visit;

  public int solution(int n, int[][] computers) {

    visit = new boolean[n];

    int count = 0;

    for (int i = 0; i < n; i++) {
      if (!visit[i]) {
        count++;
        dfs(computers, i);
      }
    }

    return count;
  }

  static void dfs(int[][] computers, int node) {

    visit[node] = true;

    for (int i = 0; i < computers[node].length; i++) {
      if (computers[node][i] == 1 && !visit[i]) {
        dfs(computers, i);
      }
    }
  }
}