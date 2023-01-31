import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        int length = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0) length++;
        }

        int[] yakSoo = new int[length];

        int a = 0;
        for (int i = 1; i <= n; i++)
        {
            if(n%i == 0){
                yakSoo[a] = i;
                a++;
            }
        }

        if(yakSoo.length >= k) {
            System.out.print(yakSoo[k - 1]);
        }else {
            System.out.print("0");
        }
    }
}