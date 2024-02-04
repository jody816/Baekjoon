import java.util.*;
import java.io.*;

public class Main {

  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static int[] check;
  static Queue<Integer> queue = new LinkedList<>();
  static int count = 1;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer input = new StringTokenizer(br.readLine());

    int vertex = Integer.parseInt(input.nextToken());
    int edge = Integer.parseInt(input.nextToken());
    int startVertex = Integer.parseInt(input.nextToken());

    for (int i = 0; i < vertex + 1; i++) {
      graph.add(new ArrayList<>());
    }
    check = new int[vertex + 1];

    for (int i = 0; i < edge; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int fromVertex = Integer.parseInt(st.nextToken());
      int toVertex = Integer.parseInt(st.nextToken());

      graph.get(fromVertex).add(toVertex);
      graph.get(toVertex).add(fromVertex);
    }
    br.close();

    for (int i = 1; i < graph.size(); i++) {
      Collections.sort(graph.get(i), Collections.reverseOrder());
    }

    bfs(startVertex);

    for (int i = 1; i < check.length; i++) {
      bw.write(check[i] + "\n");
    }
    bw.flush();
    bw.close();
  }

  private static void bfs(int vertex) {

    check[vertex] = count++;
    queue.offer(vertex);

    while (!queue.isEmpty()) {

      int v = queue.poll();

      for (int i = 0; i < graph.get(v).size(); i++) {

        int newVertex = graph.get(v).get(i);

        if (check[newVertex] != 0) {
          continue;
        }

        queue.offer(newVertex);
        check[newVertex] = count++;
      }
    }
  }
}
