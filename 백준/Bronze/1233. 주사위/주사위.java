import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int s1, s2, s3;
        do {
            s1 = stdIn.nextInt();
        } while (s1 > 20 || s1 < 2);
        do {
            s2 = stdIn.nextInt();
        } while (s2 > 20 || s2 < 2);
        do {
            s3 = stdIn.nextInt();
        } while (s3 > 40 || s3 < 2);

        ArrayList<Integer> all = new ArrayList<>();

        for (int i = 1; i <= s1; i++)
        {
            for (int j = 1; j <= s2; j++)
            {
                for (int k = 1; k <= s3; k++)
                {
                    all.add(i+j+k);
                }
            }
        }

        Collections.sort(all);
        int max = 0;
        for (int i = 0; i < all.size(); i++)
            if (max < Collections.frequency(all, all.get(i)))
                max = Collections.frequency(all, all.get(i));

        for (int i = 0; i < all.size(); i++)
        {
            if (Collections.frequency(all, all.get(i)) == max) {
                System.out.print(all.get(i));
                break;
            }
        }
    }
}