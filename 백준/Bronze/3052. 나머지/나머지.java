import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[] array = new int[10];

        int n;
        for (int i = 0; i < 10; i++)
        {
            do {
                n = stdIn.nextInt();
            } while (n > 1000 || n < 0);

            array[i] = n;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            if (!result.contains(array[i] % 42))
                result.add(array[i] % 42);
        }

        System.out.print(result.size());
    }
}