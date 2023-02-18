import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);

        int n, m;
        do {
            n = stdIn.nextInt();
        } while (n >  100 || n < 2);

        do {
            m = stdIn.nextInt();
        } while (m > 100 || m < 1);

        int[][] player = new int[n][m];
        int[] playerScore = new int[n];

        int x;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                do {
                    x = stdIn.nextInt();
                } while (x > 100 || x < 1);

                player[i][j] = x;
            }
            Arrays.sort(player[i]);
        }

        ArrayList<Integer> max = new ArrayList<>();

        for (int i = 0; i < m; i++)
        {
            int arrMax = player[0][i];
            for (int j = 0; j < n; j++)
            {
                if (arrMax < player[j][i]){
                    arrMax = player[j][i];
                }
            }
            max.add(arrMax);
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (max.get(i) == player[j][i])
                    playerScore[j]++;
            }
        }

        int playerMax = playerScore[0];
        for (int i = 1; i < playerScore.length; i++)
        {
            if (playerMax < playerScore[i])
                playerMax = playerScore[i];
        }

        for (int i = 0; i < playerScore.length; i++)
        {
            if (playerMax == playerScore[i])
                System.out.print(i+1 + " ");
        }
    }
}