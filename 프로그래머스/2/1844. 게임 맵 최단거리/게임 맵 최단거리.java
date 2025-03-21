import java.util.*;

class Solution {
    static boolean[][] visit;
    static int[] x = {1, -1, 0, 0};
    static int[] y = {0, 0, 1, -1};
    static int result = 0;
    public int solution(int[][] maps) {
        
        visit = new boolean[maps.length][maps[0].length];
        
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length; j++) {
                if (maps[i][j] == 0) {
                    visit[i][j] = true;
                }
            }
        }
        
        bfs(maps);
        
        return result;
    }
    
    static void bfs(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{0, 0});
        visit[0][0] = true;
        
        while (!queue.isEmpty()) {
            
            int[] q = queue.poll();
            
            if (q[0] == maps.length-1 && q[1] == maps[0].length-1) {
                result = maps[q[0]][q[1]];
                return;
            }
            
            for (int i = 0; i < 4; i++) {
                int X = q[0] + x[i];
                int Y = q[1] + y[i];
                
                if (X >= 0 && Y >= 0 && X < maps.length && Y < maps[0].length && maps[X][Y] > 0 && !visit[X][Y]) {
                    visit[X][Y] = true;
                    queue.offer(new int[]{X, Y});
                    maps[X][Y] += maps[q[0]][q[1]];
                }
            }
        }
        
        result = -1;
    }
}