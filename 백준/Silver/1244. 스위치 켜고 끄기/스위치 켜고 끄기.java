import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        } while (n > 100 || n < 1);

        int[] Switch = new int[n];

        for (int i = 0; i < n; i++)
        {
            int x;
            do {
                x = stdIn.nextInt();
            } while (x > 1 || x < 0);

            Switch[i] = x;
        }

        int student;
        do {
            student = stdIn.nextInt();
        } while (student > 100 || student < 1);

        for (int i = 0; i < student; i++)
        {
            int sex, receive;
            do {
                sex = stdIn.nextInt();
            } while (sex > 2 || sex < 1);
            do {
                receive = stdIn.nextInt();
            } while (receive > n || receive < 1);

            String who = (sex == 1) ? "male" : "female";

            if (who.equals("male")) {
                for (int j = receive; j <= n; j = j + receive)
                {
                    if (Switch[j - 1] == 0)
                        Switch[j - 1] = 1;
                    else
                        Switch[j - 1] = 0;
                }
            } else {
                int j = receive-1;
                int k = receive-1;

                if (Switch[j] == 0)
                    Switch[j] = 1;
                else
                    Switch[j] = 0;

                while (true) {
                    if (j < 1 || k >= n-1) {
                        break;
                    }
                    j--; k++;
                    if (Switch[j] == Switch[k]) {
                        if (Switch[j] == 0) {
                            Switch[j] = 1;
                            Switch[k] = 1;
                        } else {
                            Switch[j] = 0;
                            Switch[k] = 0;
                        }
                    } else
                        break;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(Switch[i-1] + " ");
            
            if (i % 20 == 0)
                System.out.println();
        }
    }
}