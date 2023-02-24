import java.util.Scanner;

public class Main {
    private static int pabo(int n) {
        if (n <= 1)
            return n;
        else
            return pabo(n-2) + pabo(n-1);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 20 || n < 0);

        if (n == 0)
            System.out.print(0);
        else
            System.out.print(pabo(n));
    }
}