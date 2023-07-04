import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int a = 1, b = 1, c = 6, count = 1;
        if (n != 1) {
            while (true) {
                int v = (b++)*c;
                count++;

                if (n < a+v+1) {
                    break;
                } else {
                    a += v;
                }
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}