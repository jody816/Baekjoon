import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] t = br.readLine().split(" ");
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");

        ArrayList<Integer> d = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(t[0]); i++)
            d.add(Integer.parseInt(a[i]));

        for (int i = 0; i < Integer.parseInt(t[1]); i++)
            d.add(Integer.parseInt(b[i]));

        Collections.sort(d);

        for (Integer integer : d)
            bw.write(integer + " ");

        bw.flush();
        bw.close();
    }
}
