import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int s = 2;

        ArrayList<Integer> check1 = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            if (n%i == 0)
                check1.add(i);

        if (n == 1) {

        } else if (check1.size() == 2) {
            bw.write(n + "");
            bw.flush();
            bw.close();
        } else {
            while (n != 1) {
                if (n%s != 0) {
                    s++;
                } else {
                    bw.write(s + "\n");

                    n /= s;

                    s = 2;
                }
            }
            bw.flush();
            bw.close();
        }
    }
}