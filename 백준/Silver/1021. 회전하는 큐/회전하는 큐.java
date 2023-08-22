import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] num = br.readLine().split(" ");

        int[] number = new int[num.length];

        for (int i = 0; i < num.length; i++)
            number[i] = Integer.parseInt(num[i]);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            list.add(i);

        int count = 0;

        for (int i = 0; i < num.length; i++)
        {

            if (number[i] == list.get(0)) {
                list.remove(0);
            } else {

                int c = 0, cc = 0;

                for (int j = 0; j < list.size(); j++) {
                    c++;
                    if (number[i] == list.get(j))
                        break;
                }

                for (int j = list.size()-1; j >= 0; j--) {
                    cc++;
                    if (number[i] == list.get(j))
                        break;
                }

                if (c <= cc) {
                    while (number[i] != list.get(0)) {
                        int x = list.get(0);

                        list.remove(0);

                        list.add(x);

                        count++;
                    }
                } else {
                    while (number[i] != list.get(0)) {
                        int x = list.get(list.size()-1);

                        list.remove(list.size()-1);

                        list.add(0, x);

                        count++;
                    }
                }

                i--;
            }
        }

        bw.write(count + "");

        bw.flush(); bw.close();
    }
}