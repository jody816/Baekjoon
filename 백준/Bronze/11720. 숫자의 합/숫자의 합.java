import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String m = br.readLine();
        String[] array = m.split("");

        int sum = 0;

        for (int i = 0; i < num; i++)
        {
            sum += Integer.parseInt(array[i]);
        }

        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}