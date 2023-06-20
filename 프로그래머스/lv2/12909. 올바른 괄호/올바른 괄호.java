import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();

        if (s.charAt(0) == ')' || s.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++)
            {
                try {
                    if (s.charAt(i) == '(')
                        stack.push("(");
                    else {
                        stack.pop();
                    }
                } catch (Exception e) {
                    return false;
                }
            }

            if (stack.size() != 0)
                return false;
        }

        return answer;
    }
}