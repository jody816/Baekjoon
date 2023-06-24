import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long a, b, c;
        a = stdIn.nextLong();
        b = stdIn.nextLong();
        c = stdIn.nextLong();

        long sum = a+b+c;

        System.out.println(sum);
    }
}