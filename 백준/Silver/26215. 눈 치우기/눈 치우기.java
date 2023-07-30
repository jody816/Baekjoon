import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] x = br.readLine().split(" ");

        int[] snow = new int[n];
        for (int i = 0; i < x.length; i++)
            snow[i] = Integer.parseInt(x[i]);

        Arrays.sort(snow);

        int count = 0;

        while (true) {
            int c = 0;
            for (int j : snow) {
                if (j == 0)
                    c++;
            }

            if (c == snow.length) {
                break;
            }

            snow[snow.length-1]--;

            for (int i = 0; i < snow.length-1; i++)
            {
                if (snow[i] > 0) {
                    snow[i]--;
                    break;
                }
            }

            Arrays.sort(snow);
            count++;
        }

        if (count > 1440)
            bw.write("-1");
        else
            bw.write(count + "");

        bw.flush();
        bw.close();
    }
}