import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int m, n;

        do {
            m = stdIn.nextInt();
        }while (m > 1000 || m < 1);

        do {
            n = stdIn.nextInt();
        }while (n > 1000 || n < 1);

        ArrayList<Integer> result = new ArrayList<>();

        String how = "";
        int d;
        int direction = 1;

        int x = 0; int y = 0;

        for (int i = 0; i < n; i++)
        {
            do {
                how = stdIn.next();
            }while (!how.equals("MOVE") && !how.equals("TURN"));

            if (how.equals("MOVE")){
                do {
                    d = stdIn.nextInt();
                }while (d > 1000 || d < 1);
            }else {
                do {
                    d = stdIn.nextInt();
                }while (d > 1 || d < 0);
            }

            // 0이면 왼쪽 90도, 1이면 오른쪽 90도
            if (how.equals("TURN") && d == 0){
                direction++;
                if (direction > 4)
                    direction = 1;
            } else if (how.equals("TURN") && d == 1) {
                direction--;
                if (direction < 1)
                    direction = 4;
            }

            if (how.equals("MOVE") && direction == 1){
                x += d;
            } else if (how.equals("MOVE") && direction == 2) {
                y += d;
            } else if (how.equals("MOVE") && direction == 3) {
                x -= d;
            } else if (how.equals("MOVE") && direction == 4) {
                y -= d;
            }

            if (x < 0 || x > m || y < 0 || y > m){
                result.add(0, -1);
            }
        }

        if (result.contains(-1)){
            System.out.print(-1);
        }else {
            System.out.print(x + " ");
            System.out.println(y);
        }
    }
}