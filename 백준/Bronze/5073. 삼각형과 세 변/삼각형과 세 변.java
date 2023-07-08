import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] array = br.readLine().split(" ");

            int[] triangle = new int[3];
            int sum = 0;
            for (int i = 0; i < 3; i++)
            {
                triangle[i] = Integer.parseInt(array[i]);
                sum += triangle[i];
            }

            Arrays.sort(triangle);

            if (sum == 0) {
                bw.flush();
                bw.close();
                return;
            } else {
                if (triangle[0] == triangle[1] && triangle[0] == triangle[2]) {
                    bw.write("Equilateral\n");
                } else if (triangle[2] >= triangle[0]+triangle[1]) {
                    bw.write("Invalid\n");
                } else if (triangle[0] != triangle[1] && triangle[0] != triangle[2] && triangle[1] != triangle[2]) {
                    bw.write("Scalene\n");
                } else
                    bw.write("Isosceles\n");
            }
        }
    }
}