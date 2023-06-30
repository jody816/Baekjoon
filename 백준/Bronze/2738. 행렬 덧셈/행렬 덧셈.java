import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] array = new int[n][m];

        for (int i = 0; i < 2*n; i++)
        {
            String[] f = br.readLine().split(" ");

            for (int j = 0; j < m; j++)
            {
                array[i%n][j] += Integer.parseInt(f[j]);
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                bw.write(array[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}