import java.io.*;
import java.util.Stack;

public class Main {

    static String yesOrNo(Stack<String> stack, String[] input) {

        for (String s : input) {
            if (s.equals("(")) {
                stack.add("(");
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty())
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Stack<String> stack;

        for (int i = 0; i < n; i++) {
            stack = new Stack<>();

            String[] input = br.readLine().split("");

            try {
                bw.write(yesOrNo(stack, input) + "\n");
            } catch (Exception e) {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
