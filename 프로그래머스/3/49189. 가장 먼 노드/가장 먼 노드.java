import java.util.*;
class Solution {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int count = 0;
    static boolean[] visit;
    static int[] arr;
    public int solution(int n, int[][] edge) {
        int answer = 0;
        visit = new boolean[n+1];
        arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edge.length; i++) {
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }
        
        bfs();
        
        for (int i = 0; i <= n; i++) {
            if (arr[i] == count) {
                answer++;
            }
        }
        
        return answer;
    }
    
    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visit[1] = true;
        arr[1] = 1;
        while (!q.isEmpty()) {
            int check = q.poll();
            
            for (int i = 0; i < graph.get(check).size(); i++) {
                int newV = graph.get(check).get(i);
                
                if (!visit[newV]) {
                    visit[newV] = true;
                    q.add(newV);
                    arr[newV] = arr[check] + 1;
                    count = Math.max(count, arr[newV]);
                }
            }
        }
    }
}