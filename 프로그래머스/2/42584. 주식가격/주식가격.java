import java.util.*;

class Solution {
    
    static int[] answer;
    public int[] solution(int[] prices) {
        answer = new int[prices.length];
        
        int l = prices.length;
        O: for (int i = 0; i < l-1; i++) {
            
            int c = 0;
            for (int j = i+1; j < l; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = c+1;
                    continue O;
                } else {
                    c++;
                }
            }
            
            answer[i] = c;
        }
        
        return answer;
    }
}