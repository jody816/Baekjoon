import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            int x = Integer.parseInt(br.readLine());

            list.add(x);
        }

        Collections.sort(list);

        for (Integer integer : list) {
            bw.write(integer + "\n");
        }

        bw.flush();
        bw.close();
    }
}