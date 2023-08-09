import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String map = br.readLine();

        int count = 0;

        for (int i = 0; i < map.length()-1; i++)
        {
            String x = String.valueOf(map.charAt(i)) + String.valueOf(map.charAt(i+1));

            if (x.equals("EW"))
                count++;
        }

        bw.write(count + "");
        
        bw.flush(); bw.close();
    }
}