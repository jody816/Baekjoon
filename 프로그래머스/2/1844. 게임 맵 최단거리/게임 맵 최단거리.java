import java.util.*;

class Solution {
    static int[][] map;
    static boolean[][] visit;
    static int[] x = {1, -1, 0, 0};
    static int[] y = {0, 0, -1, 1};
    public int solution(int[][] maps) {
        map = new int[maps.length][maps[0].length];
        visit = new boolean[maps.length][maps[0].length];
        
        bfs(maps);
        
        int result = -1;
        
        if (map[maps.length-1][maps[0].length-1] > 0) {
            result = map[maps.length-1][maps[0].length-1];
        }
        
        return result;
    }
    
    static void bfs(int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        
        q.offer(new int[]{0, 0});
        visit[0][0] = true;
        map[0][0] = 1;
        while (!q.isEmpty()) {
            int[] start = q.poll();
            
            if (start[0] == map.length-1 && start[1] == map[0].length-1) {
                return;
            }
            
            for (int i = 0; i < 4; i++) {
                int newX = start[0] + x[i];
                int newY = start[1] + y[i];
                
                if (newX >= 0 && newX < map.length && newY >= 0 && newY < map[0].length && !visit[newX][newY] && maps[newX][newY] == 1) {
                    q.offer(new int[]{newX, newY});
                    visit[newX][newY] = true;
                    map[newX][newY] = map[start[0]][start[1]] + 1;
                }
            }
        }
    }
}