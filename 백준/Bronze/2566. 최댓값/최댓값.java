import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] array = new int[9][9];
        int max = 0;

        for (int i = 0; i < 9; i++)
        {
            String[] f = br.readLine().split(" ");
            for (int j = 0; j < 9; j++)
            {
                array[i][j] = Integer.parseInt(f[j]);

                if (max < array[i][j])
                    max = array[i][j];
            }
        }

        O: for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (max == array[i][j]) {
                    bw.write(max + "\n" + (i+1) + " " + (j+1));
                    break O;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}