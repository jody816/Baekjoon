import java.util.*;

class Solution {
    static Stack<Character> stack;
    static ArrayList<Character> list = new ArrayList<>();
    static int count = 0;
    public int solution(String s) {
        
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (check(list)) {
                    count++;
                }
            } else {
                
                char t = list.get(0);
                list.remove(0);
                list.add(t);
                
                if (check(list)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    static boolean check(ArrayList<Character> list) {
        stack = new Stack<>();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '[' || list.get(i) == '{' || list.get(i) == '(') {
                stack.push(list.get(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                if (stack.peek() == '[' && list.get(i) == ']') {
                    stack.pop();
                } else if (stack.peek() == '{' && list.get(i) == '}') {
                    stack.pop();
                } else if (stack.peek() == '(' && list.get(i) == ')') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        if (!stack.isEmpty()) {
            return false;
        }
        
        return true;
    }
}