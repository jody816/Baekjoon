import java.util.*;
import java.io.*;

public class Main {

  static ArrayList<ArrayList<Integer>> dGraph = new ArrayList<>();
  static ArrayList<ArrayList<Integer>> bGraph = new ArrayList<>();
  static int[] dCheck;
  static int[] bCheck;
  static Queue<Integer> queue = new LinkedList<>();
  static int count = 1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer input = new StringTokenizer(br.readLine());

    int vertex = Integer.parseInt(input.nextToken());
    int edge = Integer.parseInt(input.nextToken());;
    int startVertex = Integer.parseInt(input.nextToken());

    for (int i = 0; i <= vertex; i++) {
      dGraph.add(new ArrayList<>());
      bGraph.add(new ArrayList<>());
    }
    dCheck = new int[vertex+1];
    bCheck = new int[vertex+1];
    for (int i = 0; i < edge; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int fromVertex = Integer.parseInt(st.nextToken());
      int toVertex = Integer.parseInt(st.nextToken());

      dGraph.get(fromVertex).add(toVertex);
      dGraph.get(toVertex).add(fromVertex);

      bGraph.get(fromVertex).add(toVertex);
      bGraph.get(toVertex).add(fromVertex);
    }
    br.close();

    for (int i = 1; i <= vertex; i++) {
      Collections.sort(dGraph.get(i));
      Collections.sort(bGraph.get(i));
    }

    dfs(startVertex);
//    for (int i = 1; i < dCheck.length; i++) {
//      bw.write(dCheck[i] + " ");
//    }
//    bw.write("\n");
    System.out.println();

    count = 1;
    bfs(startVertex);
//    for (int i = 1; i < bCheck.length; i++) {
//      bw.write(bCheck[i] + " ");
//    }
//
//    bw.flush();
//    bw.close();
  }

  // 깊이 우선 탐색
  private static void dfs(int vertex) {

    dCheck[vertex] = count;
    System.out.print(vertex + " ");

    for (int i = 0; i < dGraph.get(vertex).size(); i++) {
      int newVertex = dGraph.get(vertex).get(i);
      if (dCheck[newVertex] == 0) {
        count++;
        dfs(newVertex);
      }
    }
  }

  // 너비 우선 탐색
  private static void bfs(int vertex) {

    queue.offer(vertex);
    bCheck[vertex] = count;
    System.out.print(vertex + " ");

    while (!queue.isEmpty()) {

      int v = queue.poll();

      for (int i = 0; i < bGraph.get(v).size(); i++) {

        int newVertex = bGraph.get(v).get(i);

        if (bCheck[newVertex] != 0)
          continue;

        queue.offer(newVertex);
        bCheck[newVertex] = ++count;
        System.out.print(newVertex + " ");
      }
    }
  }
}
