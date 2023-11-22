import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        ArrayList<Integer> coins = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x <= k)
                coins.add(x);
        }

        int t = coins.size()-1;
        int count = 0;

        while (true) {

            if (k == 0) {
                bw.write(String.valueOf(count));
                bw.flush();
                bw.close();
                return;
            }

            count += k / coins.get(t);

            k %= coins.get(t--);
        }
    }
}
