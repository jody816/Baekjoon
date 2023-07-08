import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Long> x = new ArrayList<>();
        ArrayList<Long> y = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            String[] array = br.readLine().split(" ");

            x.add(Long.parseLong(array[0]));
            y.add(Long.parseLong(array[1]));
        }

        Collections.sort(x); Collections.sort(y);

        long xL = x.get(x.size()-1) - x.get(0);
        long yL = y.get(y.size()-1) - y.get(0);

        bw.write(xL*yL + "");
        bw.flush();
        bw.close();
    }
}