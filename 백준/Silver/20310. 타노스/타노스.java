import java.io.*;

public class Main {

    static int zero = 0, one = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '1') {
                one++;
            } else {
                zero++;
            }
        }

        String result = "0".repeat(zero/2);
        result += "1".repeat(one/2);

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
