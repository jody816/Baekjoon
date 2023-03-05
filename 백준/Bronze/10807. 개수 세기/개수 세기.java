import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 100 || n < 1);

        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = stdIn.nextInt();
        }

        int v;
        do {
            v = stdIn.nextInt();
        } while (v > 100 || v < -100);

        int count = 0;

        for (int i = 0; i < n; i++)
        {
            if (array[i] == v)
                count++;
        }

        System.out.print(count);
    }
}