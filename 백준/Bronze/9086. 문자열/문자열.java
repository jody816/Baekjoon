import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++)
        {
            String m = br.readLine();

            bw.write(String.valueOf(m.charAt(0)) + m.charAt(m.length()-1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}