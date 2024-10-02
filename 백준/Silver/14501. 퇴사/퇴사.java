import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[][] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][2];
        dp = new int[n+1];

        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < n; i++) {

            int checkIdx = i+arr[i][0];

            if (checkIdx <= n) {
                dp[checkIdx] = Math.max(dp[checkIdx], dp[i]+arr[i][1]);
            }

            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }

        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
    }
}
