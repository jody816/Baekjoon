import java.io.*;

public class Main {

    static double calculate(String[] input) {
        double sum = 0;
        for (int i = 1; i < input.length; i++)
            sum += Double.parseDouble(input[i]);

        double avg = sum / Double.parseDouble(input[0]);

        double count = 0;
        for (int i = 1; i < input.length; i++)
            if (Double.parseDouble(input[i]) > avg)
                count++;

        return (count / Double.parseDouble(input[0])) * 100;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            bw.write(String.format("%.3f%%\n", calculate(input)));
        }

        bw.flush();
        bw.close();
    }
}
