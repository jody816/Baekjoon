import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            list.add(Integer.parseInt(br.readLine()));

            sum += list.get(i);
        }
        
        Collections.sort(list);

        bw.write(sum/5 + "\n" + list.get(2));
        bw.flush();
        bw.close();
    }
}