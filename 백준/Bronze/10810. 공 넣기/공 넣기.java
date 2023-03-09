import java.util.Scanner;

public class Main {
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

        for (int u = 0; u < m; u++)
        {
            int i, j, k;
            do {
                i = stdIn.nextInt();
            } while (i > n || i < 1);
            do {
                j = stdIn.nextInt();
            } while (j > n || j < i);
            do {
                k = stdIn.nextInt();
            } while (k > n || k < 1);

            for (int r = i; r <= j; r++)
                bag[r-1] = k;
        }
        
        for (int i = 0; i < n; i++)
        {
            System.out.print(bag[i] + " ");
        }
    }
}