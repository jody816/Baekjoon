import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a, b, c, m;
        do {
            a = stdIn.nextInt();
        } while (a > 1000000 || a < 1);
        do {
            b = stdIn.nextInt();
        } while (b > 10000 || b < 1);
        do {
            c = stdIn.nextInt();
        } while (c > 10000 || c < 1);
        do {
            m = stdIn.nextInt();
        } while (m > 1000000 || m < 1);

        int sum = 0, fatigue = 0;

        if (a > m) {
            System.out.print(0);
        } else {
            for (int i = 0; i < 24; i++) {
                if (fatigue + a > m) {
                    fatigue -= c;
                    if (fatigue < 0)
                        fatigue = 0;
                } else {
                    fatigue += a;
                    sum += b;
                }
            }
            System.out.print(sum);
        }
    }
}