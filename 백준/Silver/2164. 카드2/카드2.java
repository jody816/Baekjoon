import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++)
            queue.add(i);

        while (true) {

            if (queue.size() == 1) {
                bw.write(String.valueOf(queue.peek()));
                bw.flush();
                bw.close();
                return;
            }

            queue.remove();
            queue.offer(queue.poll());
        }
    }
}
