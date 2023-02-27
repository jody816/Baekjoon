import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int h, m;

        do {
            h = stdIn.nextInt();
        } while (h > 23 || h < 0);

        do {
            m = stdIn.nextInt();
        } while (m > 59 || m < 0);

        if (m < 45) {
            if (h == 0) {
                h = 23;
            } else {
                h--;
            }
            m += 15;
        } else {
            m -= 45;
        }

        System.out.printf("%d %d", h, m);
    }
}