import java.io.*;

public class Main {
    public static int[] array = new int[46];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        array[1] = 1;

        for (int i = 2; i <= n; i++)
            array[i] = array[i-1] + array[i-2];

        bw.write(String.valueOf(array[n]));
        bw.flush();
        bw.close();
    }
}
