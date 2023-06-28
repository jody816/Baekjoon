import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = n-i; j > 0; j--)
            {
                System.out.print(" ");
            }

            for (int j = 2*i-1; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1; i > 0; i--)
        {
            for (int j = n-i; j > 0; j--)
            {
                System.out.print(" ");
            }

            for (int j = 2*i-1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }
    }
}