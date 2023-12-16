import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        char[] carr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : carr) {
            if (stack.isEmpty())
                stack.push(c);
            else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}