import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a, b, c;
        do {
            a = stdIn.nextInt();
        } while (a > 6 || a < 1);
        do {
            b = stdIn.nextInt();
        } while (b > 6 || b < 1);
        do {
            c = stdIn.nextInt();
        } while (c > 6 || c < 1);

        int result = 0;

        if (a == b && b == c) {
            result = 10000 + (a * 1000);
        } else if (a == b || a == c) {
            result = 1000 + (a * 100);
        } else if (b == c) {
            result = 1000 + (b * 100);
        } else {
            int max = a;

            if (max < b)
                max = b;
            if (max < c)
                max = c;

            result = max * 100;
        }

        System.out.print(result);
    }
}