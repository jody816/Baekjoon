import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String m = br.readLine();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="));

        String[] array = m.split("");

        int count = 0;

        for (int i = 0; i < array.length; i++)
        {
            try {
                if (arrayList.contains(array[i]+array[i+1])) {
                    count++;
                    i++;
                } else if (array[i].equals("d") && array[i+1].equals("z") && array[i+2].equals("=") && arrayList.contains(array[i]+array[i+1]+array[i+2])) {
                    count++;
                    i++;
                    i++;
                } else {
                    count++;
                }
            } catch (Exception e) {
                if (i == array.length-1)
                    count++;
                else if (i > array.length-1)
                    break;
                else {
                    count++;
                }
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}