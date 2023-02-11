import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a;
        do {
            a = stdIn.nextInt();
        }while (a > 100000 || a < 1);

        String n = String.valueOf(a);

        StringBuilder sb = new StringBuilder();

        for(int i = 1 ; i <= 100000 ; i++) {
            sb.append(i);
        }

        System.out.print(sb.indexOf(n) + 1);
    }
}