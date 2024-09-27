import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            bw.write("1/1");
        } else if (n == 2) {
            bw.write("1/2");
        } else {

            int l = 1, r = 2;

            int flag = 2;
            String d = "l";

            for (int i = 0; i < n-2; i++) {

                if (d.equals("l")) {
                    if (l == flag && r == 1) {
                        l += 1;
                        flag = l;
                        d = "r";
                        continue;
                    }
                } else {
                    if (r == flag && l == 1) {
                        r += 1;
                        flag = r;
                        d = "l";
                        continue;
                    }
                }

                if (d.equals("l")) {
                    l += 1;
                    r -= 1;
                } else {
                    r += 1;
                    l -= 1;
                }
            }

            bw.write(l + "/" + r);
        }

        bw.flush();
        bw.close();
    }
}
