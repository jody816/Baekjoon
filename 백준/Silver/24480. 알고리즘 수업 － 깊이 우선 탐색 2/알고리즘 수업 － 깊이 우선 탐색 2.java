import java.util.*;
import java.io.*;

public class Main {

  // 방문 순서
  static int count = 1;

  // 그래프를 그리기 위한 리스트
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

  // 정점마다 방문 순서를 출력하기 위한 배열
  static int[] check;

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

    // 리스트(그래프) 초기화 (0번째 인덱스는 더미 데이터)
    for (int i = 0; i <= vertex; i++) {
      graph.add(new ArrayList<>());
    }

    // check 배열 초기화 (0번째 인덱스는 더미 데이터)
    check = new int[vertex + 1];

    // 그래프 그리기
    for (int i = 0; i < edge; i++) {
      StringTokenizer line = new StringTokenizer(br.readLine());

      int fromVertex = Integer.parseInt(line.nextToken());
      int toVertex = Integer.parseInt(line.nextToken());

      // 무방향이기 때문에 서로 넣어줌
      graph.get(fromVertex).add(toVertex);
      graph.get(toVertex).add(fromVertex);
    }
    
    br.close();

    // 문제에서 내림차순이라고 했으므로 역정렬
    for (int i = 1; i < graph.size(); i++) {
      Collections.sort(graph.get(i), Comparator.reverseOrder());
    }

    // 방문 체크 재귀 함수
    recursion(startVertex);

    // 결과 출력
    for (int i = 1; i < check.length; i++) {
      bw.write(check[i] + "\n");
    }
    bw.flush();
    bw.close();
  }

  private static void recursion(int vertex) {

    // 정점 방문 횟수를 저장
    check[vertex] = count;

    for (int i = 0; i < graph.get(vertex).size(); i++) {

      int newVertex = graph.get(vertex).get(i);

      // 깊이 우선 탐색이므로 여기서 재귀
      if (check[newVertex] == 0) {
        count++;
        recursion(newVertex);
      }
    }
  }
}
