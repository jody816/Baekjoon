import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        int answer = 2;
        
        for (String s : dic) {
            
            int check = 0;
            O: for (int i = 0; i < spell.length; i++) {
                
                for (char c : s.toCharArray()) {
                    
                    if (spell[i].equals(String.valueOf(c))) {
                        check++;
                        continue O;
                    }
                }
            }
            
            if (spell.length == check) {
                return 1;
            }
        }
        
        return answer;
    }
}