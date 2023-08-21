import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        Stack<Long> stack = new Stack<>();

        for (int i = 0; i < k; i++)
        {

            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push((long) x);
            }
        }

        long sum = 0;

        int n = stack.size();

        for (int i = 0; i < n; i++)
        {
            sum += stack.pop();
        }

        bw.write(sum + "");

        bw.flush(); bw.close();
    }
}