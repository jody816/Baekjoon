import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int count = 0;

        for (int b = 1; b <= 500; b++)
        {
            for (int a = 1; a <= 500; a++)
            {
                if(a*a - b*b == n){
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}