import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] list= new String[n];

        for (int i = 0; i < n; i++)
            list[i] = br.readLine();

        int l = list[0].length()-1;
        int lResult = l+1;

        while (true) {

            ArrayList<Long> x = new ArrayList<>();

            for (int i = 0; i < n; i++)
            {
                long g = Long.parseLong(list[i].substring(l));

                if (x.contains(g)) {
                    break;
                } else {
                    x.add(g);
                }
            }

            if (x.size() == n) {
                bw.write(lResult-l + "");
                break;
            } else
                l--;

        }


        bw.flush(); bw.close();
    }
}