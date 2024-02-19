import java.util.*;
import java.io.*;

public class Main {

  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static boolean[] visit;
  static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int vertex = Integer.parseInt(st.nextToken());
    int edge = Integer.parseInt(st.nextToken());

    visit = new boolean[vertex+1];

    for (int i = 0; i <= vertex; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < edge; i++) {
      StringTokenizer input = new StringTokenizer(br.readLine());

      int fromVertex = Integer.parseInt(input.nextToken());
      int toVertex = Integer.parseInt(input.nextToken());

      graph.get(fromVertex).add(toVertex);
      graph.get(toVertex).add(fromVertex);
    }

    for (int i = 1; i <= vertex; i++) {
      if (!visit[i]) {
        count++;
        dfs(i);
      }
    }

    bw.write(String.valueOf(count));
    bw.flush();
    bw.close();
  }

  static void dfs(int vertex) {

    if (!visit[vertex]) {
      visit[vertex] = true;

      ArrayList<Integer> list = graph.get(vertex);

      for (int i = 0; i < list.size(); i++) {
        int newVertex = list.get(i);
        dfs(newVertex);
      }
    }
  }
}
