import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int son = 0, mom;

        int i = Integer.parseInt(input1[1]);
        int j = Integer.parseInt(input2[1]);
        int r = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input2[0]);

        mom = lcm(i, j);

        son += (r * (mom/i)) + (k * (mom/j));

        int g = gcd(son, mom);
        if (g > 1) {
            mom /= g;
            son /= g;
        }

        bw.write(son + " " + mom);
        bw.flush();
        bw.close();
    }

    static private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
