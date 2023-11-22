import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");

        int m = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");

        Set<String> A = new HashSet<>(Arrays.asList(a).subList(0, n));

        for (int i = 0; i < m; i++)
        {
            if (A.contains(b[i])) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
