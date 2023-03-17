import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int result = 0;

        if (n % 5 == 0) {
            result += n/5;
            System.out.print(result);
        } else {
            int count = 0;
            while (true) {
                n -= 3;
                count++;

                if (n > 0 && n < 3) {
                    System.out.print(-1);
                    break;
                } else if (n % 5 == 0){
                    result += (count + n/5);
                    System.out.print(result);
                    break;
                } else if (n == 3){
                    result = count + 1;
                    System.out.print(result);
                    break;
                }
            }
        }
    }
}