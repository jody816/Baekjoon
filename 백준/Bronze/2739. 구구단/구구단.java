import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        for (int i = 1; i < 10; i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}