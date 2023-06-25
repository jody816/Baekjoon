import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x = stdIn.nextInt();
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++)
        {
            int a = stdIn.nextInt(), b = stdIn.nextInt();

            x -= (a*b);
        }

        if (x == 0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}