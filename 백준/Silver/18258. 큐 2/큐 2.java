import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public final static Queue<Integer> q = new LinkedList<>();
    public static int back;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");

            if (input.length > 1) {
                q.add(Integer.parseInt(input[1]));
                back = Integer.parseInt(input[1]);
                continue;
            }

            bw.write(methodCall(input[0].charAt(0)) + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static int methodCall(char c) {

        switch (c) {
            case 'p':
                if (q.peek() == null)
                    return -1;
                else
                    return q.poll();
            
            case 's':
                return q.size();
                
            case 'e':
                if (q.isEmpty())
                    return 1;
                else
                    return 0;
                
            case 'f':
                if (q.peek() != null)
                    return q.peek();
                else
                    return -1;
            
            case 'b':
                if (q.isEmpty())
                    return -1;
                else
                    return back;
        }

        return 0;
    }
}
