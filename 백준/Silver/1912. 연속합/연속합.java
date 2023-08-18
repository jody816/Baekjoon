import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        Integer[] x = new Integer[n];

        for (int i = 0; i < n; i++)
            x[i] = Integer.parseInt(input[i]);

        int[] m = new int[n];
        int max;

        m[0] = x[0];
        max = m[0];

        for (int i = 1; i < n; i++)
        {
            m[i] = Math.max(m[i-1] + x[i], x[i]);

            max = Math.max(max, m[i]);
        }

        bw.write(max + "");

        bw.flush(); bw.close();
    }
}