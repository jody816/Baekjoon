import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] r = new String[n+m];
        String[] v = new String[n];

        int count = 0;

        for (int i = 0; i < n+m; i++)
        {
            r[i] = br.readLine();
        }

        Arrays.sort(r);

        for (int i = 0; i < n+m-1; i++)
        {
            if (r[i].equals(r[i+1])) {
                v[count++] = r[i];
                i++;
            }
        }

        bw.write(count + "\n");

        for (int i = 0; i < count; i++)
            bw.write(v[i] + "\n");


        bw.flush();
        bw.close();
    }
}