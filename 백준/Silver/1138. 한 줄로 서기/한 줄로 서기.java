import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static boolean compare(int[] a, int[] b) {
        int count = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == b[i])
                count++;
        }

        return count == a.length;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] stat = new int[n];
        for (int i = 0; i < n; i++)
            stat[i] = Integer.parseInt(input[i]);

        ArrayList<Integer> check = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            check.add(i+1);

        int[] result = new int[n];

        while (!compare(stat, result)) {
            Collections.shuffle(check);

            for (int i = 1; i <= n; i++)
            {
                int count = 0;

                for (int j = 0; j < n; j++)
                {
                    if (i == check.get(j)) {
                        break;
                    } else if (i < check.get(j)) {
                        count++;
                    }
                }

                result[i-1] = count;
            }
        }

        for (int i = 0; i < n; i++)
            bw.write(check.get(i) + " ");

        bw.flush(); bw.close();
    }
}