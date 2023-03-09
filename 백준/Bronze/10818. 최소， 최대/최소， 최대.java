import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 1000000 || n < 1);

        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            int x;
            do {
                x = stdIn.nextInt();
            } while (x > 1000000 || x < -1000000);
            array[i] = x;
        }

        int max = array[0], min = array[0];

        for (int i = 0; i < n; i++)
        {
            if (max < array[i])
                max = array[i];

            if (min > array[i])
                min = array[i];
        }

        System.out.printf("%d %d", min, max);
    }
}