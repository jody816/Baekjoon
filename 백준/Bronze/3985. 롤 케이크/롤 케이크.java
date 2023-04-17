import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int l, n;
        do {
            l = stdIn.nextInt();
        } while (l > 1000 || l < 1);
        do {
            n = stdIn.nextInt();
        } while (n > 1000 || n < 1);

        int[] rollCake = new int[l];
        int[] expect = new int[n];
        int max = 0, findMax = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++)
        {
            int p, k;
            do {
                p = stdIn.nextInt();
            } while (p > l || p < 1);
            do {
                k = stdIn.nextInt();
            } while (k > l || k < p);

            expect[i] = k-p;

            for (int j = p-1; j < k; j++)
            {
                if (rollCake[j] == 0)
                    rollCake[j] = i+1;
            }

            if (max < expect[i]) {
                max = expect[i];
                findMax = i+1;
            }
        }

        int resultMax = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < l; j++)
            {
                if (rollCake[j] == (i+1))
                    result[i]++;
            }

            if (resultMax < result[i])
                resultMax = result[i];
        }

        System.out.println(findMax);

        for (int i = 0; i < n; i++)
        {
            if (result[i] == resultMax) {
                System.out.print(i + 1);
                break;
            }
        }
    }
}