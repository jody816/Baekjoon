import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int x, y;

        int n;

        do {
            n = stdIn.nextInt();
        }while (n == 0);
        x = n;

        do {
            n = stdIn.nextInt();
        }while (n == 0);
        y = n;

        if(x > 0 && y > 0){
            System.out.print(1);
        } else if (x > 0 && y < 0) {
            System.out.print(4);
        } else if (x < 0 && y > 0) {
            System.out.print(2);
        } else if (x < 0 && y < 0) {
            System.out.print(3);
        }
    }
}