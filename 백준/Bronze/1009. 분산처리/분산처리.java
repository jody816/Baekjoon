import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String[] input = br.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int result = 1;
            for (int j = 0; j < b; j++) {

                result = result * a % 10;
            }

            result = result == 0 ? 10 : result;
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}
