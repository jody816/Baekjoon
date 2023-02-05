import java.util.Scanner;

public class Main {
    static int check(int[] card, int n, int m){
        int result = 0;

        for (int i = 0; i < n-2; i++)
        {
            for (int j = (i+1); j < n-1; j++)
            {
                for (int k = (j+1); k < n; k++)
                {
                    int sum = card[i]+card[j]+card[k];
                    if (sum == m){
                        return sum;
                    }
                    if (result < sum && sum < m) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n, m;

        int x;
        do {
            x = stdIn.nextInt();
        }while (x > 100 || x < 3);
        n = x;

        do {
            x = stdIn.nextInt();
        }while (x > 300000 || x < 10);
        m = x;

        int[] card = new int[n];

        for (int i = 0; i < card.length; i++) {
            do {
                x = stdIn.nextInt();
            } while (x > 100000 || x < 1);
            card[i] = x;
        }

        System.out.print(check(card,n,m));
    }
}