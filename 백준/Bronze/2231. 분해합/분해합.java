import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 1000000 || n < 1);

        int result = 0;

        for (int i = 0; i < n; i++)
        {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == n) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}