import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String m = br.readLine();

        int sum = 2;

        for (int i = 0; i < m.length(); i++)
        {
            if (m.charAt(i) <= 'C') {
                sum += 1;
            } else if (m.charAt(i) <= 'F') {
                sum += 2;
            } else if (m.charAt(i) <= 'I') {
                sum += 3;
            } else if (m.charAt(i) <= 'L') {
                sum += 4;
            } else if (m.charAt(i) <= 'O') {
                sum += 5;
            } else if (m.charAt(i) <= 'S') {
                sum += 6;
            } else if (m.charAt(i) <= 'V') {
                sum += 7;
            } else if (m.charAt(i) <= 'Z') {
                sum += 8;
            }

            sum += 2;
        }
        sum -= 2;

        System.out.println(sum);
    }
}