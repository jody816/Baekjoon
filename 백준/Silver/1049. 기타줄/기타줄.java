import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < m; i++)
        {
            String[] x = br.readLine().split(" ");

            a.add(Integer.parseInt(x[0]));
            b.add(Integer.parseInt(x[1]));
        }

        Collections.sort(a); Collections.sort(b);

        int p = n/6;
        int o = n%6;

        if (a.get(0) > b.get(0)*6) {
            bw.write(b.get(0)*n + "");
        } else {
            int sum = p * a.get(0);

            if (o*b.get(0) > a.get(0)) {
                sum += a.get(0);
            } else {
                sum += o*b.get(0);
            }

            bw.write(sum + "");
        }

        bw.flush(); bw.close();
    }
}