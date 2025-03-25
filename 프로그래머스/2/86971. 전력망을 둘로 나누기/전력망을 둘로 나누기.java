import java.util.*;

class Solution {
    static List<List<Integer>> tree = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;
    
    public int solution(int n, int[][] wires) {
        
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }
        
        for (int[] arr : wires) {
            tree.get(arr[0]).add(arr[1]);
            tree.get(arr[1]).add(arr[0]);
        }
        
        for (int[] arr : wires) {
            boolean[] visit = new boolean[n+1];
            
            tree.get(arr[0]).remove(Integer.valueOf(arr[1]));
            tree.get(arr[1]).remove(Integer.valueOf(arr[0]));
            
            int count = dfs(1, visit);
            
            answer = Math.min(answer, Math.abs((n-count) - count));
            
            tree.get(arr[0]).add(arr[1]);
            tree.get(arr[1]).add(arr[0]);
        }
        
        return answer;
    }
    
    static private int dfs(int wire, boolean[] visit) {
        
        visit[wire] = true;
        int c = 1;
        
        for (int i = 0; i < tree.get(wire).size(); i++) {
            
            int nextWire = tree.get(wire).get(i);
            
            if (!visit[nextWire]) {
                c += dfs(nextWire, visit);
            }
        }
        
        return c;
    }
}