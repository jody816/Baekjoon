import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        int[] person = new int[n];
        for (int i = 0; i < n; i++) {
            person[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(person);

        int sum = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {

            sum += (t + person[i]);

            t += person[i];
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
