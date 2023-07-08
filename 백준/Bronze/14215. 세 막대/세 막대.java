import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(" ");

        int[] tA = new int[3];
        for (int i = 0; i < 3; i++)
        {
            tA[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(tA);
        
        while (true) {
            if (tA[2] >= tA[0]+tA[1])
                tA[2]--;
            else {
                bw.write(tA[0]+tA[1]+tA[2] + "");
                bw.flush();
                bw.close();
                return;
            }
        }
    }
}