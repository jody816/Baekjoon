import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt();

        int[] result = new int[t];

        for (int i = 0; i < t; i++)
        {
            double x, y, r, x2, y2, r2;

            do {
                x = stdIn.nextDouble();
            } while (x > 10000 || x < -10000);
            do {
                y = stdIn.nextDouble();
            } while (y > 10000 || y < -10000);
            do {
                r = stdIn.nextDouble();
            } while (r > 10000 || r < 0);
            do {
                x2 = stdIn.nextDouble();
            } while (x2 > 10000 || x2 < -10000);
            do {
                y2 = stdIn.nextDouble();
            } while (y2 > 10000 || y2 < -10000);
            do {
                r2 = stdIn.nextDouble();
            } while (r2 > 10000 || r2 < 0);

            if (x==x2 && y==y2 && r==r2) {
                result[i] = -1;
                continue;
            }

            double d = ((x-x2)*(x-x2)) + ((y-y2)*(y-y2));
            d = Math.sqrt(d);

            double sumR = (r > r2) ? r - r2 : r2 - r;

            if (sumR < d && d < r2+r) {
                result[i] = 2;
            } else if (d == r+r2 || d == sumR) {
                result[i] = 1;
            } else if (d > r+r2 || d < sumR || d == 0){
                result[i] = 0;
            }
        }

        for (int j : result) System.out.println(j);
    }
}