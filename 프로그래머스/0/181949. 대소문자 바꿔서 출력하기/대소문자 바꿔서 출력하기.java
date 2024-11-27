import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String x = br.readLine();
        
        for (char a : x.toCharArray()) {
            
            if (a >= 97) {
                bw.write(String.valueOf(a).toUpperCase());
            } else {
                bw.write(String.valueOf(a).toLowerCase());
            }
        }
        
        bw.flush();
        bw.close();
    }
}