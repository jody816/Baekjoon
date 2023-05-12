import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double a, b, c, d, e, f;

        do {
            a = stdIn.nextDouble();
        } while (a > 999 || a < -999);

        do {
            b = stdIn.nextDouble();
        } while (b > 999 || b < -999);

        do {
            c = stdIn.nextDouble();
        } while (c > 999 || c < -999);

        do {
            d = stdIn.nextDouble();
        } while (d > 999 || d < -999);

        do {
            e = stdIn.nextDouble();
        } while (e > 999 || e < -999);

        do {
            f = stdIn.nextDouble();
        } while (f > 999 || f < -999);

        int x = 0, y = 0;

        for (int i = -999; i < 1000; i++)
        {
            for (int j = -999; j < 1000; j++)
            {
                if ((a*i + b*j) == c && (d*i + e*j) == f) {
                    x = i; y = j;
                }
            }
        }

        System.out.print(x + " " + y);
    }
}