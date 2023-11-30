import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();

        char na, nb;
        char a, b;
        if (n.length() > 1) {
            a = n.charAt(0);
            b = n.charAt(1);

            na = n.charAt(0);
            nb = n.charAt(1);
        } else {
            a = '0';
            b = n.charAt(0);

            na = '0';
            nb = n.charAt(0);
        }

        int count = 0;

        while (true) {

            String A = String.valueOf(a);
            String B = String.valueOf(b);

            int s = Integer.parseInt(A) + Integer.parseInt(B);

            count++;

            String C = String.valueOf(s);

            a = b;
            b = C.charAt(C.length() - 1);

            if (a == na && b == nb)
                break;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
