import java.util.*;

class Solution {
    static List<String> list = new ArrayList<>();
    static String[] words = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer = 0;
        
        recur("", 0);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    static private void recur(String str, int depth) {
        list.add(str);
        
        if (depth == 5) return;
        
        for (int i = 0; i < 5; i++) {
            recur(str+words[i], depth+1);
        }
    }
}