import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>(9);

        int n;
        for (int i = 0; i < 9; i++)
        {
            do {
                n = stdIn.nextInt();
            } while (n < 1 || array.contains(n));
            array.add(n);
        }

        int max = array.get(0);
        for (int i = 0; i < 9; i++)
        {
            if (max < array.get(i))
                max = array.get(i);
        }

        int seq = array.indexOf(max);

        System.out.printf("%d\n%d", max, seq+1);
    }
}