import java.io.*;
import java.util.*;

public class Main {

    static int[] arr = new int[10];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int result = 0;

        for (int i = 0; i < input.length(); i++) {

            int number = Integer.parseInt(String.valueOf(input.charAt(i)));

            arr[number]++;
        }

        int idx = 0;
        int sixOrNine = 0;
        while (idx != 10) {

            if (idx == 6 || idx == 9) {
                idx++;
                continue;
            }

            if (arr[idx] > 0) {
                arr = Arrays.stream(arr)
                        .map(x -> x-1)
                        .toArray();

                result++;

                continue;
            }

            idx++;
        }

        sixOrNine += (arr[6] + arr[9]);

        if (sixOrNine > 0) {
            result += sixOrNine % 2 == 0 ? sixOrNine/2 : sixOrNine/2+1;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
