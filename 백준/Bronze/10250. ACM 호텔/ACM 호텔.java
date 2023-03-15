import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int t, h, w, n;
        t = stdIn.nextInt();

        int[] result = new int[t];

        for (int j = 0; j < t; j++) {
            do {
                h = stdIn.nextInt();
            } while (h > 99 || h < 1);
            do {
                w = stdIn.nextInt();
            } while (w > 99 || w < 1);
            do {
                n = stdIn.nextInt();
            } while (n > h*w || n < 1);

            int height = 0;
            int wide = 1;

            for (int i = 1; i <= n; i++) {
                height++;
                if (height > h) {
                    height -= h;
                    wide++;
                }
            }

            w = w - (w - wide);

            result[j] = (height * 100) + w;
        }

        for (int i = 0; i < t; i++)
        {
            System.out.println(result[i]);
        }
    }
}