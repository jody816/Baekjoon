import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        O: for (int i = 0; i < t; i++)
        {
            int count = 1;

            int deliver = Integer.parseInt(br.readLine());
            int d = deliver;

            String[] input = br.readLine().split(" ");

            int[] first = new int[input.length];

            for (int j = 0; j < input.length; j++) {
                first[j] = Integer.parseInt(input[j]);

                deliver -= first[j];

                if (deliver < 0) {
                    bw.write(1 + "\n");
                    continue O;
                }
            }

            V: while (true) {

                deliver = d;

                count++;

                int[] second = new int[input.length];

                for (int j = 0; j < input.length; j++)
                {
                    second[j] = first[(j+3)%6] + first[(j+1)%6] + first[(j+5)%6];

                    deliver -= (second[j] + first[j]);

                    if (deliver < 0) {
                        bw.write(count + "\n");
                        break V;
                    }
                }

                for (int j = 0; j < input.length; j++)
                    first[j] += second[j];
            }
        }

        bw.flush();
        bw.close();
    }
}