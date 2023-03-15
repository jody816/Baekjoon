import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 50 || n < 1);

        ArrayList<Integer> president = new ArrayList<>(n);

        for (int i = 0; i < n; i++)
        {
            int x;
            do {
                x = stdIn.nextInt();
            } while (x > 100 || x < 1);
            president.add(x);
        }

        int count = 0;

        if (n == 1) {
            System.out.print(0);
        } else {
            while (true) {
                int max = president.get(0);
                for (int i = 1; i < n; i++)
                {
                    if (max < president.get(i))
                        max = president.get(i);
                }

                int Frequency = Collections.frequency(president, max);

                if (president.get(0) < max || Frequency != 1) {
                    int tmp = president.get(0) + 1;
                    president.set(0, tmp);

                    for (int i = 1; i < n; i++)
                    {
                        if (president.get(i) == max) {
                            int tmp2 = max - 1;
                            president.set(i, tmp2);
                            break;
                        }
                    }
                    count++;
                } else {
                    break;
                }
            }

            System.out.print(count);
        }
    }
}