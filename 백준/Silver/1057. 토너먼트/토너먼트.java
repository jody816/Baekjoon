import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt(), kim = stdIn.nextInt(), lim = stdIn.nextInt();

        ArrayList<Integer> tor = new ArrayList<>();
        ArrayList<Integer> check;

        for (int i = 1; i <= n; i++)
        {
            tor.add(i);
        }

        int round = 0;

        O: while (true) {
            int k = 0;
            if (n%2 != 0) {
                k = tor.get(tor.size()-1);
            }

            check = new ArrayList<>();

            for (int i = 0; i < n-1; i+=2)
            {
                if ((tor.get(i) == kim && tor.get(i+1) == lim)
                || (tor.get(i) == lim && tor.get(i+1) == kim))
                {
                    round++;
                    break O;
                } else if (tor.get(i) == kim || tor.get(i+1) == kim) {
                    check.add(kim);
                } else if (tor.get(i) == lim || tor.get(i+1) == lim) {
                    check.add(lim);
                } else {
                    check.add(tor.get(i));
                }
            }

            if (k != 0) {
                check.add(k);
            }

            tor.clear();
            tor.addAll(check);
            n = check.size();

            round++;
        }

        System.out.print(round);
    }
}