import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int[] lines = new int[k];
        long max = 0;
        long min = 0;

        for (int i = 0; i < k; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            if (max < lines[i])
                max = lines[i];
        }

        max++;

        while (min < max) {

            long mid = (max + min) / 2;
            
            long sum = 0;
            
            for (int i = 0; i < k; i++) {
                if (lines[i] >= mid)
                    sum += (lines[i] / mid);
            }
            
            if (sum < n) {
                max = mid;
            } else
                min = mid + 1;
        }

        bw.write(String.valueOf(min - 1));
        bw.flush();
        bw.close();
    }
}
