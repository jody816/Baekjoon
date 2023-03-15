import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a;
        do {
            a = stdIn.nextInt();
        } while (a > 1000000000 || a < 2);
        int b, v;
        do {
            b = stdIn.nextInt();
        } while (b > a-1 || b < 1);
        do {
            v = stdIn.nextInt();
        } while (v > 1000000000 || v < a);

        int result = (v-b) / (a-b);
        if (((v-b) % (a-b)) != 0)
            System.out.print(result+1);
        else
            System.out.print(result);
    }
}