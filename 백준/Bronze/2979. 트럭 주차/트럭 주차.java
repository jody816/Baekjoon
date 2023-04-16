import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a, b, c;

        do {
            a = stdIn.nextInt();
        } while (a > 100 || a < 1);
        do {
            b = stdIn.nextInt();
        } while (b > a || b < 1);
        do {
            c = stdIn.nextInt();
        } while (c > b || c < 1);

        ArrayList<Integer> findMax = new ArrayList<>();

        ArrayList<Integer> first = new ArrayList<>();
        int fi = stdIn.nextInt();
        int fo = stdIn.nextInt();
        findMax.add(fi);
        findMax.add(fo);
        for (int i = fi; i < fo; i++)
        {
            first.add(i);
        }

        ArrayList<Integer> second = new ArrayList<>();
        int si = stdIn.nextInt();
        int so = stdIn.nextInt();
        findMax.add(si);
        findMax.add(so);
        for (int i = si; i < so; i++)
        {
            second.add(i);
        }

        ArrayList<Integer> third = new ArrayList<>();
        int ti = stdIn.nextInt();
        int to = stdIn.nextInt();
        findMax.add(ti);
        findMax.add(to);
        for (int i = ti; i < to; i++)
        {
            third.add(i);
        }

        Collections.sort(findMax);

        int price = 0;

        for (int i = 1; i <= findMax.get(findMax.size()-1); i++)
        {
            int x = 0;

            if (first.contains(i))
                x++;
            if (second.contains(i))
                x++;
            if (third.contains(i))
                x++;

            if (x == 1)
                price += (a*x);
            else if (x == 2)
                price += (b*x);
            else if (x == 3)
                price += (c*x);
        }

        System.out.print(price);
    }
}