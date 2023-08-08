import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String doc = br.readLine();
        String find = br.readLine();

        int count = 0;

        while (doc.length() >= find.length()) {

            String x = doc.substring(0, find.length());

            if (x.equals(find)) {
                count++;
                doc = doc.substring(find.length());
            } else {
                doc = doc.substring(1);
            }
        }

        bw.write(count + "");
        
        bw.flush(); bw.close();
    }
}