import java.io.*;
import java.util.Stack;

public class Main {

    public final static Stack<Integer> s = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");

            if (input.length > 1) {
                s.add(Integer.parseInt(input[1]));
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
                if (s.isEmpty())
                    return -1;
                else
                    return s.pop();

            case 's':
                return s.size();

            case 'e':
                if (s.isEmpty())
                    return 1;
                else
                    return 0;

            case 't':
                if (s.isEmpty())
                    return -1;
                else
                    return s.peek();
        }

        return 0;
    }
}
