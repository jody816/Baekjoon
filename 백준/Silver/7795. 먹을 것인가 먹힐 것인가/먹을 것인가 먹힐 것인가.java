import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++)
        {
            int count = 0;

            String[] AB = br.readLine().split(" ");

            String[] a = br.readLine().split(" ");
            int[] A = Stream.of(a).mapToInt(Integer::parseInt).toArray();

            String[] b = br.readLine().split(" ");
            int[] B = Stream.of(b).mapToInt(Integer::parseInt).toArray();

            Arrays.sort(A); Arrays.sort(B);

            for (int j = 0; j < A.length; j++)
            {
                for (int k = 0; k < B.length; k++)
                {
                    if (A[j] > B[B.length-1]) {
                        count += B.length;
                        break;
                    } else if (A[j] <= B[0]) {
                        break;
                    } else {
                        if (A[j] > B[k]) {
                            count++;
                        }
                        else
                            break;
                    }
                }
            }

            bw.write(count + "\n");
        }

        bw.flush(); bw.close();
    }
}