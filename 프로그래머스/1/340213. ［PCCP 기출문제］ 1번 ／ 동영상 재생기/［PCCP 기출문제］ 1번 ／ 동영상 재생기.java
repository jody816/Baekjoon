import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int[] video = Arrays.stream(video_len.split(":"))
            .mapToInt(Integer::parseInt).toArray();
        
        int[] post = Arrays.stream(pos.split(":"))
            .mapToInt(Integer::parseInt).toArray();
        
        int[] start = Arrays.stream(op_start.split(":"))
            .mapToInt(Integer::parseInt).toArray();
        
        int[] end = Arrays.stream(op_end.split(":"))
            .mapToInt(Integer::parseInt).toArray();
        
        for (String s : commands) {
            skip(start, post, end);
            if (s.equals("next")) {
                
                post[1] += 10;
                post[0] += post[1]/60;
                post[1] %= 60;
                
                if (post[0] >= video[0] && post[1] > video[1]) {
                    post[0] = video[0];
                    post[1] = video[1];
                }
            } else {
                
                post[1] -= 10;
                if (post[1] < 0) {
                    post[0]--;
                    post[1] = 60 + post[1];
                }
                
                if (post[0] < 0) {
                    post[0] = 0;
                    post[1] = 0;
                    continue;
                }
            }
            skip(start, post, end);
        }
        
        String m = String.valueOf(post[0]);
        String s = String.valueOf(post[1]);
        
        StringBuilder sb = new StringBuilder();
        if (m.length() == 1) {
            sb.append(0).append(m);
        } else {
            sb.append(m);
        }
        
        sb.append(":");
        
        if (s.length() == 1) {
            sb.append(0).append(s);
        } else {
            sb.append(s);
        }
        
        return sb.toString();
    }
    
    static private void skip(int[] start, int[] post, int[] end) {
        
        System.out.println("처음: " + post[1]);
        
        int postSeconds = post[1] + (post[0] * 60);
        int startSeconds = start[1] + (start[0] * 60);
        int endSeconds = end[1] + (end[0] * 60);
        
        if (startSeconds <= postSeconds && postSeconds <= endSeconds) {
            post[0] = end[0];
            post[1] = end[1];
        }
    }
}