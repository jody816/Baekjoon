import java.util.Scanner;

public class Main {
    public static int[] result = new int[1];

    public static int recursion(String s, int l, int r, int count){
        result[0] = ++count;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1, count);
    }

    public static int isPalindrome(String s, int count){
        return recursion(s, 0, s.length()-1, count);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int t;
        do {
            t = stdIn.nextInt();
        } while (t > 1000 || t < 1);

        for (int i = 0; i < t; i++)
        {
            int count = 0;
            String x = stdIn.next();

            System.out.print(isPalindrome(x, count) + " ");
            System.out.println(result[0]);
        }
    }
}