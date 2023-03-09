import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 1000 || n < 1);

        double[] score = new double[n];
        double x;
        for (int i = 0; i < n; i++)
        {
            do {
                x = stdIn.nextDouble();
            } while (x > 100 || x < 0);

            score[i] = x;
        }

        double max = score[0];
        for (int i = 1; i < n; i++)
        {
            if (max < score[i])
                max = score[i];
        }

        double sum = 0;

        for (int i = 0; i < n; i++)
        {
            score[i] = (score[i] / max) * 100.0;

            sum += score[i];
        }

        System.out.print(sum/n);
    }
}