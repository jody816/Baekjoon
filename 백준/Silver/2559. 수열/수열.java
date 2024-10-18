import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nk = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] arr = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt).toArray();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= nk[0]-nk[1]; i++) {
            int sum = arr[i];

            for (int j = i+1; j < i+nk[1]; j++) {
                sum += arr[j];
            }

            max = Math.max(max, sum);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
