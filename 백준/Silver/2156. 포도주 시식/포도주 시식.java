import java.io.*;

public class Main {
    public static int[] wines;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        wines = new int[n];

        for (int i = 0; i < n; i++)
            wines[i] = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(maxWineAmount(wines)));
        bw.flush();
        bw.close();
    }

    public static int maxWineAmount(int[] wines) {
        int[] dp = new int[wines.length + 1];

        dp[0] = 0;
        dp[1] = wines[0];

        if (wines.length > 1)
            dp[2] = wines[0] + wines[1];

        for (int i = 3; i <= wines.length; i++) {
            dp[i] = Math.max(dp[i - 1],
                Math.max(dp[i - 2] + wines[i - 1],
                dp[i - 3] + wines[i - 1] + wines[i - 2]));
        }

        return dp[wines.length];
    }
}
