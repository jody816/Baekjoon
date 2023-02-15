import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n, m, l;

        do {
            n = stdIn.nextInt();
        }while (n > 50 || n < 3);

        do {
            m = stdIn.nextInt();
        }while (m > 50 || m < 1);

        do {
            l = stdIn.nextInt();
        }while (l > n-1 || l < 1);

        int[][] circle = new int[n][1];
        circle[0][0]++;

        int count= 0;
        int f = 0;
        while (true){
            if ((circle[f][0] % 2) == 1) {
                if (circle[f][0] == m)
                    break;

                count++;
                f = (f+l) % n;
                circle[f][0]++;
            } else if ((circle[f][0] % 2) == 0) {
                if (circle[f][0] == m)
                    break;

                count++;

                if ((f-l) < 0){
                    f = (f-l)+n;
                }else {
                    f = f - l;
                }

                circle[f][0]++;
            }
        }

        System.out.println(count);
    }
}