import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double n = stdIn.nextDouble();

        for (double i = n/4; i > 0; i--)
            System.out.print("long ");
        System.out.print("int");
    }
}