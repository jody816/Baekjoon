import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String m = br.readLine();

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++)
        {
            if (m.contains(String.valueOf(alphabet))) {
                bw.write(m.indexOf(String.valueOf(alphabet)) + " ");
            } else {
                bw.write("-1 " + "");
            }
        }
        bw.flush();
        bw.close();
    }
}