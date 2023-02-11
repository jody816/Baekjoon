import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int h, w;
        do {
            h = stdIn.nextInt();
        }while (h < 1);
        do {
            w = stdIn.nextInt();
        }while (w > 500);

        int[][] world = new int[h][w];

        for (int i = 0; i < w; i++)
        {
            int block = stdIn.nextInt();
            for (int j = h; j > h-block; j--)
            {
                world[j-1][i] = 1;
            }
        }

        for (int i = 0; i < h; i++)
        {
            int t = 0;
            for (int j = 0; j < w; j++)
            {
                if (world[i][j] == 1)
                    t++;
                else if (world[i][j] == 0 && t > 0) {
                    world[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < h; i++)
        {
            for (int j = w-1; j > -1; j--)
            {
                if (world[i][j] == 1)
                    break;
                else
                    world[i][j] = 0;
            }
        }

        int count = 0;
        for (int i = 0; i < h; i++)
        {
            for (int j = 0;  j < w; j++)
            {
                if (world[i][j] == 2)
                    count++;
            }
        }
        System.out.println(count);
    }
}