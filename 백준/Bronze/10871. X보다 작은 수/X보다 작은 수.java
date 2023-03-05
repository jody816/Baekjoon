import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n, x;

        do {
            n = stdIn.nextInt();
        } while (n > 10000 || n < 1);

        do {
            x = stdIn.nextInt();
        } while (x > 10000 || x < 1);

        int[] array = new int[n];

        int a;
        for (int i = 0; i < n; i++)
        {
            do {
                a = stdIn.nextInt();
            } while (a > 10000 || a < 1);
            array[i] = a;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            if (array[i] < x)
                result.add(array[i]);
        }

        for (Integer integer : result) System.out.print(integer + " ");
    }
}