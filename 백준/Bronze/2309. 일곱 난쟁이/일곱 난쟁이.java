import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = -100;
        int[] arr = new int[9];
        
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            
            sum += arr[i];
        }
        
        int a = 0, b = 0;
        for (int i = 0; i < 8; i++)
            for (int j = i+1; j < 9; j++)
                if (arr[i] + arr[j] == sum) {
                    a = arr[i];
                    b = arr[j];
                }

        Arrays.sort(arr);

        for (int j : arr)
            if (j != a && j != b)
                bw.write(j + "\n");
        bw.flush();
        bw.close();
    }
}
