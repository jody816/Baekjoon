import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String m = br.readLine();

        int r = m.charAt(0);

        bw.write(r+"");
        bw.flush();
        bw.close();
    }
}