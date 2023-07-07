import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(" ");

        ArrayList<Integer> distance = new ArrayList<>();

        int x = Integer.parseInt(array[0]);
        int y = Integer.parseInt(array[1]);
        int w = Integer.parseInt(array[2]);
        int h = Integer.parseInt(array[3]);

        distance.add(x);
        distance.add(w-x);
        distance.add(y);
        distance.add(Math.abs(h-y));

        Collections.sort(distance);

        bw.write(distance.get(0) + "");
        bw.flush();
        bw.close();
    }
}