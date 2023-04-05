import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n, m;
        do {
            n = stdIn.nextInt();
        } while (n > 10000 || n < 1);
        do {
            m = stdIn.nextInt();
        } while (m > 300000000 || m < 1);

        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            int x;
            do {
                x = stdIn.nextInt();
            } while (x > 30000 || x < 1);

            array[i] = x;
        }

        int count = 0;

        for (int i = 0; i < n-1; i++)
        {
            int t = array[i];

            if (t == m) {
                count++;
            } else if (t < m) {
                for (int j = i+1; j < n; j++)
                {
                    t += array[j];

                    if (t == m)
                        count++;
                    else if (t > m) {
                        break;
                    }
                }
            }
        }

        if (array[n-1] == m)
            count++;

        System.out.print(count);
    }
}