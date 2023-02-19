import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 100 || n < 1);

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            a.add(i+1);
        }

        while (a.size() != 1) {
            for (int i = 0; i < a.size(); i++)
            {
                if (i % 2 == 0) {
                    a.set(i, 0);
                }
            }

            while (a.remove(Integer.valueOf(0))) {}
        }

        System.out.print(a.get(0));
    }
}