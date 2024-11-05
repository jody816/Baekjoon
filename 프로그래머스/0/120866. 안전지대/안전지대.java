class Solution {
    
    static int[][] b;
    static int[] x = {0, 0, 1, -1, 1, 1, -1, -1};
    static int[] y = {1, -1, 0, 0, 1, -1, 1, -1};
    
    public int solution(int[][] board) {
        
        b = board;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    marking(i, j);
                }
            }
        }
        
        int count = 0;
        for (int d[] : b) {
            for (int i = 0; i < d.length; i++) {
                if (d[i] == 0) count++;
            }
        }
        
        return count;
    }
    
    static private void marking(int i, int j) {
        for (int k = 0; k < 8; k++) {
            int X = i + x[k];
            int Y = j + y[k];
            
            if (X >= 0 && X < b.length && Y >= 0 && Y < b[0].length && b[X][Y] == 0) {
                b[X][Y] = 2;
            }
        }
    }
}