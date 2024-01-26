import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.parseInt(br.readLine());
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int x = 1, c = 0;
        while (true) {
            if (c == n) {
                bw.write(sb.toString());
                bw.flush();
                bw.close();
                return;
            } else if (x > n+1) {
                bw.write("NO");
                bw.flush();
                bw.close();
                return;
            }
            
            int a = result[c];
            
            if (stack.isEmpty()) {
                stack.push(x++);
                sb.append("+").append("\n");
            } else if (stack.peek() == a) {
                stack.pop();
                sb.append("-").append("\n");
                c++;
            } else if (x > n && stack.peek() == a) {
                bw.write("NO");
                bw.flush();
                bw.close();
                return;
            } else {
                stack.push(x++);
                sb.append("+").append("\n");
            }
        }
    }
}
