import java.util.*;

class Solution {
    static Stack<Character> stack = new Stack<>();
    boolean solution(String s) {

        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if (c == '(') {
                
                stack.push(c);
            } else {
                
                if (stack.isEmpty()) {
                    return false;
                }
                
                if (stack.peek() == ')') {
                    return false;
                }
                
                stack.pop();
            }
        }
        
        

        return stack.isEmpty();
    }
}