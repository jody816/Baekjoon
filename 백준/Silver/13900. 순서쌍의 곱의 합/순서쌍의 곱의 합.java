import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        }while (n > 100000 || n < 2);

        long[] number = new long[n];

        long firstSum = 0;
        for (int i = 0; i < number.length; i++)
        {
            int a;
            do {
                a = stdIn.nextInt();
            }while (a > 10000 || a < 0);

            number[i] = a;

            firstSum += a;
        }

        long[] secondSum = new long[n];
        secondSum[0] = firstSum;

        for (int i = 1; i < n; i++)
        {
            secondSum[i] = (secondSum[i-1] - number[i-1]);
        }

        long sum = 0;
        for (int i = 0; i < n-1; i++)
        {
            sum += (number[i] * secondSum[i+1]);
        }

        System.out.print(sum);
    }
}