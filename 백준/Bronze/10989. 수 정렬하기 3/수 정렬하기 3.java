import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            short x = Short.parseShort(br.readLine());

            array[i] = x;
        }

        Arrays.sort(array);

        for (Integer integer : array) {
            bw.write(integer + "\n");
        }

        bw.flush();
        bw.close();
    }
}