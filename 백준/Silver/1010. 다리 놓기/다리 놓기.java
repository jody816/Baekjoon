import java.util.Scanner;

public class Main {
    public static void main(String[] arga){
        Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt();  // 테스트 케이스
        double n;  // 서쪽 사이트
        double m;  // 동쪽 사이트

        int test = 0; // 테스트 케이스 조절

        int[] print = new int[t];

        while (test < t) {
            do {
                n = stdIn.nextInt();
            } while (n > 29 || n < 1);

            do {
                m = stdIn.nextInt();
            } while (m > 29 || m < n);

            double result = 1;

            double b = n;
            for (double i = m; i > 0; i--) {
                if ((m - n) >= i) {
                    result *= i / ++b;
                } else {
                    result *= i / b--;
                }
            }

            print[test++] = (int)Math.round(result);
        }

        for (int i = 0; i < print.length; i++){
            System.out.println(print[i]);
        }
    }
}