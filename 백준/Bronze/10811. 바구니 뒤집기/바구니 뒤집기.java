import java.util.Scanner;

public class Main {
    private static void reverse(int[] bag, int i, int j) {
        if (i != j) {
            int[] array = new int[j-i+1];

            int count = 0;

            for (int k = j; k >= i; k--)
            {
                array[count++] = bag[k-1];
            }

            count = 0;

            for (int k = i; k <= j; k++)
            {
                bag[k-1] = array[count++];
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n, m;
        do {
            n = stdIn.nextInt();
        } while (n > 100 || n < 1);
        do {
            m = stdIn.nextInt();
        } while (m > 100 || m < 1);

        int[] bag = new int[n];
        for (int i = 0; i < n; i++)
        {
            bag[i] = i+1;
        }

        for (int u = 0; u < m; u++)
        {
            int i, j;
            do {
                i = stdIn.nextInt();
            } while (i > n || i < 1);
            do {
                j = stdIn.nextInt();
            } while (j > n || j < i);

            reverse(bag, i, j);
        }

        for (int i = 0; i < n; i++)
            System.out.print(bag[i] + " ");
    }
}