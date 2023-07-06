import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = m; i <= n; i++)
        {
            ArrayList<Integer> check = new ArrayList<>();

            for (int j = 1; j <= i; j++)
            {
                if (i%j == 0)
                    check.add(j);
            }

            if (check.size() == 2)
                arrayList.add(i);
        }

        if (arrayList.size() == 0)
            bw.write("-1");
        else {
            int sum = 0;

            for (Integer integer : arrayList) {
                sum += integer;
            }

            bw.write(sum + "\n" + arrayList.get(0));
        }

        bw.flush();
        bw.close();
    }
}