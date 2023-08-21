import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ab = br.readLine().split(" ");

        String a = ab[0];
        String b = ab[1];

        int aLength = a.length(), bLength = b.length();

        int count = 0;

        if (b.contains(a))
            bw.write("0");
        else if (aLength == bLength) {
            int check = 0;

            for (int i = 0; i < aLength; i++)
            {
                if (a.charAt(i) != b.charAt(i))
                    check++;
            }

            bw.write(check + "");
        } else {
            ArrayList<Integer> find = new ArrayList<>();

            while (b.length() >= a.length()) {

                int check = 0;

                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) != b.charAt(i))
                        check++;
                }

                find.add(check);
                b = b.substring(1);
            }

            Collections.sort(find);

            bw.write(find.get(0) + "");
        }

        bw.flush(); bw.close();
    }
}