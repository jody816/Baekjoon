import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        String[] array = br.readLine().split(" ");

        for (int i = 0; i < n; i++)
        {
            int e = Integer.parseInt(array[i]);

            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int j = 1; j <= e; j++)
            {
                if (e%j == 0)
                    arrayList.add(j);
            }

            if (arrayList.size() == 2) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}