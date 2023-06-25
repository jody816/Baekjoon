import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while (stdIn.hasNextInt()) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();

            System.out.println(a+b);
        }
    }
}