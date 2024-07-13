import java.util.*;

class Solution {
    
    static Stack<Integer> stack = new Stack<>();
    
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        
//         for (int price : prices) {
//             stack.push(price);
//         }
        
//         int l = prices.length-1;
//         int check = stack.peek();
//         for (int i = 0; i < prices.length; i++) {
//             int current = stack.pop();
//             if (check >= current) {
//                 answer[l-i] = i;
//             } else {
//                 answer[l-i] = 1;
//             }
            
//             check = current;
//         }
        
        O: for (int i = 0; i < prices.length-1; i++) {
            int c = 0;
            for (int j = i+1; j < prices.length; j++) {
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