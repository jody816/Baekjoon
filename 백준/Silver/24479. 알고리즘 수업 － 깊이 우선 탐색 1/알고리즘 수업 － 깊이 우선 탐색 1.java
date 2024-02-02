import java.util.*;
import java.io.*;

public class Main {

  static int[] check;
  static int count;
  static ArrayList<ArrayList<Integer>> graph;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    // 정점의 수
    int vertex = Integer.parseInt(st.nextToken());

    // 간선의 수
    int edge = Integer.parseInt(st.nextToken());

    // 시작 정점
    int startVertex = Integer.parseInt(st.nextToken());

    // 그래프를 그리기 위한 리스트
    graph = new ArrayList<>();
    // 그래프의 인덱스를 정점의 개수만큼 만듦
    // (혼란을 방지하고자 0번 인덱스를 더미 데이터로 활용)
    for (int i = 0; i <= vertex; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < edge; i++) {
      StringTokenizer token = new StringTokenizer(br.readLine());

      int fromVertex = Integer.parseInt(token.nextToken());
      int toVertex = Integer.parseInt(token.nextToken());

      // 무방향 그래프이기에 서로 넣어줌
      graph.get(fromVertex).add(toVertex);
      graph.get(toVertex).add(fromVertex);
    }

    // 오름차순을 위해 정렬을 해줌
    for (int i = 1; i < graph.size(); i++) {
      Collections.sort(graph.get(i));
    }

    // 방문한 정점을 기록할 배열
    // 방문한 정점이 최대 정점의 개수만큼 있기 때문에,
    // 정점의 개수만큼의 크기로 배열 생성
    // 0번째 인덱스는 더미데이터
    check = new int[vertex+1];

    // 방문 순서를 저장할 필드 (시작 정점의 방문 순서는 1)
    count = 1;

    // 깊이 우선 탐색 재귀 시작
    dfs(startVertex);

    // 각 정점의 방문 횟수를 출력
    for (int i = 1; i <= vertex; i++) {
      bw.write(check[i] + "\n");
    }

    bw.flush();
    bw.close();
  }

  // 깊이 우선 탐색 메서드
  private static void dfs(int vertex) {

    // 현재 방문하고 있는 정점에 순서 저장
    check[vertex] = count;

    // 현재 위치한 정점이 갈 수 있는 정점 리스트를 순회
    for (int i = 0; i < graph.get(vertex).size(); i++) {

      // 갈 수 있는 정점
      int newVertex = graph.get(vertex).get(i);

      // 갈 수 있는 정점에 방문을 했는지 체크(0일 경우 방문 X)
      if (check[newVertex] == 0) {
        count++;
        dfs(newVertex);
      }
    }
  }
}
