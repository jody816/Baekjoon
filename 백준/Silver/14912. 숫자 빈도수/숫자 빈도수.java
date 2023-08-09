import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int first = Integer.parseInt(num[0]);
        String two = num[1];

        int count = 0;

        for (int i = 1; i <= first; i++)
        {
            String x = String.valueOf(i);
            for (int j = 0; j < x.length(); j++)
            {
                if (String.valueOf(x.charAt(j)).equals(two))
                    count++;
            }
        }

        bw.write(count + "");
        
        bw.flush(); bw.close();
    }
}