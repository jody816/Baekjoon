import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        ArrayList<Integer> student = new ArrayList<>();

        for (int i = 0; i < 30; i++)
        {
            student.add(0);
        }

        int x;
        for (int i = 0; i < 28; i++)
        {
            do {
                x = stdIn.nextInt();
            } while (x > 30 || x < 1 || student.contains(x));

            student.set(x-1, x);
        }

        for (int i = 0; i < 30; i++)
        {
            if (student.get(i) == 0) {
                System.out.println(i+1);
            }
        }
    }
}