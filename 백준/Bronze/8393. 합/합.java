import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        long sum = 0;

        for (int i = n; i > 0; i--)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}