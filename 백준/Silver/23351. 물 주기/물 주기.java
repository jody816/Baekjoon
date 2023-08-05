import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int[] bowl = new int[n];

        for (int i = 0; i < n; i++)
        {
            bowl[i] = k;
        }

        int count = 0;

        O: while (true) {
            for (int j : bowl) {
                if (j == 0)
                    break O;
            }

            for (int i = 0; i < a; i++) {
                Arrays.sort(bowl);

                bowl[0] += b;
            }

            for (int i = 0; i < bowl.length; i++) {
                bowl[i]--;
            }

            count++;
        }

        bw.write(count + "");
        bw.flush(); bw.close();
    }
}