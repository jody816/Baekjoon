import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int y = 0, m = 0;

        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i : input) {
            
            if (i == 0) continue;
            
            int checkY = i/30;
            int checkM = i/60;
            
            y += checkY * 10;
            m += checkM * 15;
            
            if (i>0) {
                y += 10;
                m += 15;
            }
        }
        
        if (y == m) bw.write("Y M " + y);
        else {
            if (y > m) bw.write("M " + m);
            else bw.write("Y " + y);
        }
        bw.flush();
        bw.close();
    }
}
