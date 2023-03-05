import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n, l, d, r, g;

        do {
            n = stdIn.nextInt();
        } while (n > 100 || n < 1);
        do {
            l = stdIn.nextInt();
        } while (l > 1000 || l < 1);

        int[] traffic = new int[l+1];
        int[][] staticTrafficLight = new int[n][2];
        int[][] trafficLight = new int[n][2];

        for (int i = 0; i < n; i++)
        {
            do {
                d = stdIn.nextInt();
            } while (d > l-1 || d < 1);
            traffic[d] = 1;

            for (int j = 0; j < 2; j++)
            {
                if (j == 0) {
                    do {
                        r = stdIn.nextInt();
                    } while (r > 100 || r < 1);
                    staticTrafficLight[i][j] = r;
                    trafficLight[i][j] = r;
                } else {
                    do {
                        g = stdIn.nextInt();
                    } while (g > 100 || g < 1);
                    staticTrafficLight[i][j] = g;
                    trafficLight[i][j] = g;
                }
            }
        }

        int horse = 0, count = 0;
        int meetTraffic = 0;

        while (horse != l) {
            if (traffic[horse] == 0) {
                horse++;
            } else {
                if (trafficLight[meetTraffic][0] < 1) {
                    horse++;
                    meetTraffic++;
                }
            }
            count++;

            for (int i = 0; i < n; i++) {
                if (trafficLight[i][0] == 0) {
                    trafficLight[i][1]--;
                } else {
                    trafficLight[i][0]--;
                }
            }

            for (int i = 0; i < n; i++) {
                if (trafficLight[i][0] == 0 && trafficLight[i][1] == 0) {
                    trafficLight[i][0] = staticTrafficLight[i][0];
                    trafficLight[i][1] = staticTrafficLight[i][1];
                }
            }
        }

        System.out.print(count);
    }
}