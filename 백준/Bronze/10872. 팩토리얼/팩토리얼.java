import java.util.Scanner;

public class Main {
    private static int ft(int n) {
        if (n == 1)
            return 1;
        else
            return n * ft(n - 1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 12 || n < 0);

        if (n == 0)
            System.out.print(1);
        else {
            System.out.print(ft(n));
        }
    }
}