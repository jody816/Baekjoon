import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1)
                return;

            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int i = 1; i < n; i++)
            {
                if (n%i == 0)
                    arrayList.add(i);
            }

            int sum = 0;

            for (Integer integer : arrayList)
                sum += integer;

            if (sum == n) {
                bw.write(n + " = ");

                for (int i = 0; i < arrayList.size()-1; i++)
                {
                    bw.write(arrayList.get(i) + " + ");
                }

                bw.write(arrayList.get(arrayList.size()-1) + "\n");
            } else {
                bw.write(n + " is NOT perfect.\n");
            }

            bw.flush();
        }
    }
}