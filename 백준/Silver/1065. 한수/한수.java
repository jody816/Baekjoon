import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        }while (n > 1000 || n < 1);

        int count = 0;

        if (n <= 99){
            System.out.println(n);
        } else {
            for (int i = 100; i <= n; i++)
            {
                String s = String.valueOf(i);

                if ((Integer.parseInt(String.valueOf(s.charAt(1))) - Integer.parseInt(String.valueOf(s.charAt(0)))) == (Integer.parseInt(String.valueOf(s.charAt(2))) - Integer.parseInt(String.valueOf(s.charAt(1))))){
                    count++;
                }
            }
            System.out.println(99+count);
        }
    }
}