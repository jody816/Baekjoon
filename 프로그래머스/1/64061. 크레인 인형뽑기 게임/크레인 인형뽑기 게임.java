import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < moves.length; i++) {

            for (int j = 0; j < board.length; j++) {

                if (board[j][moves[i]-1] != 0) {

                    if (stack.size() > 0 && stack.peek() == board[j][moves[i]-1]) {

                        stack.pop();
                        count++;
                    } else {
                        stack.add(board[j][moves[i]-1]);
                    }

                    board[j][moves[i]-1] = 0;

                    break;
                }
            }
        }
        return count*2;
    }
}