import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String n = stdIn.next();

        String[] a = n.split("");

        Arrays.sort(a, Collections.reverseOrder());

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }
}