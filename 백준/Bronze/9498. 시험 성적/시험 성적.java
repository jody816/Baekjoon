import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a;

        do {
            a = stdIn.nextInt();
        } while (a > 100 || a < 0);

        if (a >= 90)
            System.out.print("A");
        else if (a >= 80) {
            System.out.print("B");
        } else if (a >= 70) {
            System.out.print("C");
        } else if (a >= 60) {
            System.out.print("D");
        } else
            System.out.print("F");
    }
}