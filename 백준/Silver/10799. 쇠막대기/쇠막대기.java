import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String x = br.readLine();
        br.close();
        
        Stack<Character> stack = new Stack<>();
        int count = 0;
        
        for (int i = 0; i < x.length(); i++) {
            
            if (x.charAt(i) == '(') {
                stack.push(x.charAt(i));
                continue;
            } else {
                stack.pop();
                
                if (x.charAt(i-1) == ')') {
                    count += 1;
                } else {
                    count += stack.size();
                }
            }
        }
        
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}