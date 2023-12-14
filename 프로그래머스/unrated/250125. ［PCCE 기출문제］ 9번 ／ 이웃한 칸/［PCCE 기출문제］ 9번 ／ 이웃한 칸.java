class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int a = h-1;
        int b = h+1;
        int x = w-1;
        int y = w+1;

        try {
            if (board[h][w].equals(board[a][w]))
                count++;

        } catch (Exception ignored) {}

        try {
            if (board[h][w].equals(board[b][w]))
                count++;

        } catch (Exception ignored) {}

        try {
            if (board[h][w].equals(board[h][x]))
                count++;

        } catch (Exception ignored) {}

        try {
            if (board[h][w].equals(board[h][y]))
                count++;

        } catch (Exception ignored) {}

        return count;
    }
}