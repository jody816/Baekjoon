import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String m = br.readLine();

        String[] array = m.split(" ");

        int count = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i].equals(""))
                count++;

        bw.write((array.length - count) + "");
        bw.flush();
        bw.close();
    }
}