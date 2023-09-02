import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] first = br.readLine().split(" ");
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++)
            a.add(Integer.parseInt(first[i]));
        
        String[] second = br.readLine().split(" ");
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++)
            b[i] = Integer.parseInt(second[i]);

        Integer[] checkB = new Integer[n];
        System.arraycopy(b, 0, checkB, 0, n);
        Arrays.sort(checkB, Collections.reverseOrder());

        Collections.sort(a);
        
        Integer[] checkA = new Integer[n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (Objects.equals(checkB[i], b[j]) && checkA[j] == null) {
                    checkA[j] = a.get(i);
                    break;
                }
            }
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += (checkA[i]*b[i]);

        bw.write(sum + "");
        
        bw.flush();
        bw.close();
    }
}