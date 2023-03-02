import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a, b, c;

        do {
            a= stdIn.nextInt();
        } while (a > 23 || a < 0);

        do {
            b = stdIn.nextInt();
        } while (b > 59 || b < 0);

        do {
            c = stdIn.nextInt();
        } while (c > 1000 || c < 0);

        int d = b + c;

        while (true) {
            if (d < 60)
                break;
            else {
                d -= 60;
                a++;
            }
        }

        if (a > 23) {
            a -= 24;
        }

        System.out.printf("%d %d", a, d);
    }
}