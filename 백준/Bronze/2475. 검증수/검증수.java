import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        long sum = 0;
        for (int i : arr) {

            sum += Math.pow(i, 2);
        }

        bw.write(String.valueOf(sum%10));
        bw.flush();
        bw.close();
    }
}
