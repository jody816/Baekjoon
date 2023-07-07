import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] one = br.readLine().split(" ");
        String[] two = br.readLine().split(" ");
        String[] three = br.readLine().split(" ");

        String[] x = new String[3];
        String[] y = new String[3];

        x[0] = one[0];
        x[1] = two[0];
        x[2] = three[0];
        y[0] = one[1];
        y[1] = two[1];
        y[2] = three[1];

        for (int i = 0; i < x.length; i++)
        {
            if (Collections.frequency(Arrays.asList(x), x[i]) == 1) {
                bw.write(x[i] + " ");
                break;
            }
        }

        for (int i = 0; i < y.length; i++)
        {
            if (Collections.frequency(Arrays.asList(y), y[i]) == 1) {
                bw.write(y[i] + "");
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}