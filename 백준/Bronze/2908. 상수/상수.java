import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String m = br.readLine();

        String[] array = m.split(" ");

        String[] result = new String[2];

        for (int i = 0; i < 2; i++)
        {
            result[i] = "";
            for (int j = 2; j >= 0; j--)
            {
                result[i] += String.valueOf(array[i].charAt(j));
            }
        }

        if (Integer.parseInt(result[0]) > Integer.parseInt(result[1]))
            System.out.println(result[0]);
        else System.out.println(result[1]);
    }
}