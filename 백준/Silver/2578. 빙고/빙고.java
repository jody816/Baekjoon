import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        ArrayList<Integer> board = new ArrayList<>(25);

        int x;
        for (int i = 0; i < 25; i++)
        {
            do {
                x = stdIn.nextInt();
            }while (x > 25 || x < 1 || board.contains(x));
            board.add(x);
        }

        ArrayList<Integer> mc = new ArrayList<>(25);
        for (int i = 0; i < 25; i++)
        {
            do {
                x = stdIn.nextInt();
            }while (x > 25 || x < 1 || mc.contains(x));
            mc.add(x);
        }

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;

        int count = 0;
        for (int i = 0; i < 25; i++)
        {
            board.set(board.indexOf(mc.get(i)), 0);
            count++;

            if (board.get(0) == 0 && board.get(1) == 0 && board.get(2) == 0 && board.get(3) == 0 && board.get(4) == 0)
                a = 1;

            if (board.get(5) == 0 && board.get(6) == 0 && board.get(7) == 0 && board.get(8) == 0 && board.get(9) == 0)
                b = 1;

            if (board.get(10) == 0 && board.get(11) == 0 && board.get(12) == 0 && board.get(13) == 0 && board.get(14) == 0)
                c = 1;

            if (board.get(15) == 0 && board.get(16) == 0 && board.get(17) == 0 && board.get(18) == 0 && board.get(19) == 0)
                d = 1;

            if (board.get(20) == 0 && board.get(21) == 0 && board.get(22) == 0 && board.get(23) == 0 && board.get(24) == 0)
                e = 1;

            if (board.get(0) == 0 && board.get(5) == 0 && board.get(10) == 0 && board.get(15) == 0 && board.get(20) == 0)
                f = 1;

            if (board.get(1) == 0 && board.get(6) == 0 && board.get(11) == 0 && board.get(16) == 0 && board.get(21) == 0)
                g = 1;

            if (board.get(2) == 0 && board.get(7) == 0 && board.get(12) == 0 && board.get(17) == 0 && board.get(22) == 0)
                h = 1;

            if (board.get(3) == 0 && board.get(8) == 0 && board.get(13) == 0 && board.get(18) == 0 && board.get(23) == 0)
                j = 1;

            if (board.get(4) == 0 && board.get(9) == 0 && board.get(14) == 0 && board.get(19) == 0 && board.get(24) == 0)
                k = 1;

            if (board.get(0) == 0 && board.get(6) == 0 && board.get(12) == 0 && board.get(18) == 0 && board.get(24) == 0)
                l = 1;

            if (board.get(4) == 0 && board.get(8) == 0 && board.get(12) == 0 && board.get(16) == 0 && board.get(20) == 0)
                m = 1;

            if (a+b+c+d+e+f+g+h+j+k+l+m >= 3){
                System.out.println(count);
                break;
            }
        }
    }
}