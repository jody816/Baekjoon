import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int t;
        do {
            t = stdIn.nextInt();
        } while (t > 100);

        int[][] board = new int[100][100];

        for (int i = 0; i < t; i++)
        {
            int side, height;

            do {
                side = stdIn.nextInt();
            } while (side > 91 || side < 1);
            do {
                height = stdIn.nextInt();
            } while (height > 91 || height < 1);

            for (int j = side; j < side+10; j++)
            {
                for (int k = height; k < height+10; k++)
                {
                    board[j-1][k-1] = 1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 100; i++)
            for (int j = 0; j < 100; j++)
                if (board[i][j] == 1)
                    count++;


        System.out.print(count);
    }
}