import java.util.*;
import java.io.*;

public class Main {

  // 그래프
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static int[] check;
  static int count = 1;
  static Queue<Integer> queue = new LinkedList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer input = new StringTokenizer(br.readLine());

    // 정점의 수
    int vertex = Integer.parseInt(input.nextToken());
    // 간선의 수
    int edge = Integer.parseInt(input.nextToken());
    // 시작 정점
    int startVertex = Integer.parseInt(input.nextToken());

    // 초기화
    for (int i = 0; i <= vertex; i++) {
      graph.add(new ArrayList<>());
    }
    check = new int[vertex+1];

    // 그래프 그리기
    for (int i = 0; i < edge; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int fromVertex = Integer.parseInt(st.nextToken());
      int toVertex = Integer.parseInt(st.nextToken());

      // 무방향이기 때문에 서로 넣어줌
      graph.get(fromVertex).add(toVertex);
      graph.get(toVertex).add(fromVertex);
    }
    br.close();

    // 오름차순 방문
    for (int i = 1; i < graph.size(); i++) {
      Collections.sort(graph.get(i));
    }

    bfs(startVertex);

    for (int i = 1; i < check.length; i++) {
      bw.write(check[i] + "\n");
    }
    bw.flush();
    bw.close();
  }

  private static void bfs(int vertex) {
    check[vertex] = count;
    queue.add(vertex);

    while (!queue.isEmpty()) {
      int u = queue.poll();

      for (int i = 0; i < graph.get(u).size(); i++) {
        int newVertex = graph.get(u).get(i);

        if (check[newVertex] != 0) {
          continue;
        }

        queue.add(newVertex);
        check[newVertex] = ++count;
      }
    }
  }
}
