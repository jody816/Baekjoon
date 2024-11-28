import java.awt.Point;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        Point point = new Point(0, 0);
        
        int h = board[0]/2;
        int w = board[1]/2;
        
        for (String s : keyinput) {
            
            if (s.equals("left")) {
                point.x -= 1;
                if (point.x < -h) {
                    point.x = -h;
                }
            } else if (s.equals("right")) {
                point.x += 1;
                if (point.x > h) {
                    point.x = h;
                }
            } else if (s.equals("up")) {
                point.y += 1;
                if (point.y > w) {
                    point.y = w;
                }
            } else {
                point.y -= 1;
                if (point.y < -w) {
                    point.y = -w;
                }
            }
        }
        
        return new int[]{point.x, point.y};
    }
}