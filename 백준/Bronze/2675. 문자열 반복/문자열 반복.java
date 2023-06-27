import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            String two = st.nextToken();

            for (int k = 0; k < two.length(); k++)
            {
                for (int j = 0; j < one; j++)
                {
                    bw.write(two.charAt(k) + "");
                }
            }

            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}