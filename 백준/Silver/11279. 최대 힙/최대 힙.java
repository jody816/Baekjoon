import java.io.*;
import java.util.*;

public class Main {

    static PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            int x = Integer.parseInt(br.readLine());

            if (x > 0) {
                q.offer(x);
            } else if (x == 0) {

                if (q.size() > 0) {
                    bw.write(q.poll() + "\n");
                } else {
                    bw.write("0\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
