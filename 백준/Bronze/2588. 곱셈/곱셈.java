import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int A = stdIn.nextInt();
        String B = stdIn.next();

        for (int i = 2; i >= 0; i--)
        {
            System.out.println(Integer.parseInt(String.valueOf(B.charAt(i))) * A);
        }

        System.out.print(Integer.parseInt(B) * A);
    }
}