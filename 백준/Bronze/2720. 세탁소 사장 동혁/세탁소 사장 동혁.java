import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++)
        {
            int x = Integer.parseInt(br.readLine());

            bw.write(x/25 + " ");

            int one = x%25;

            bw.write(one/10 + " ");

            int two = one%10;

            bw.write(two/5 + " ");

            int three = two%5;

            bw.write(three + "\n");
        }
        bw.flush();
        bw.close();
    }
}