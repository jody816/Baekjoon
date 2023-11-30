import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");

            int sum = 0;
            int p = 1;

            for (String s : input) {
                if (s.equals("O")) {
                    sum += p++;
                } else
                    p = 1;
            }

            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
