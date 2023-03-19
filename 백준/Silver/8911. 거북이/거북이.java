import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt();

        int[] result = new int[t];

        ArrayList<Integer> x;
        ArrayList<Integer> y;

        for (int i = 0; i < t; i++)
        {
            String  a = stdIn.next();

            x = new ArrayList<>();
            y = new ArrayList<>();
            int direction = 0;

            int whereX = 0;
            int whereY = 0;

            x.add(0); y.add(0);

            for (int j = 0; j < a.length(); j++)
            {
                if (a.charAt(j) == 'L') {
                    direction--;
                    direction = (direction + 4) % 4;
                } else if (a.charAt(j) == 'R') {
                    direction++;
                    direction = (direction + 4) % 4;
                } else if (a.charAt(j) == 'F') {
                    switch (direction) {
                        case 0:
                            whereY++;
                            break;

                        case 1:
                            whereX++;
                            break;

                        case 2:
                            whereY--;
                            break;

                        case 3:
                            whereX--;
                            break;
                    }
                } else if (a.charAt(j) == 'B') {
                    direction = (direction + 4) % 4;

                    switch (direction) {
                        case 0:
                            whereY--;
                            break;

                        case 1:
                            whereX--;
                            break;

                        case 2:
                            whereY++;
                            break;

                        case 3:
                            whereX++;
                            break;
                    }
                }

                x.add(whereX);
                y.add(whereY);
            }

            Collections.sort(x);
            Collections.sort(y);

            int width = (x.get(0) < 0) ? -x.get(0) + x.get(x.size()-1) : x.get(0) + x.get(x.size()-1);
            int height = (y.get(0) < 0) ? -y.get(0) + y.get(y.size()-1) : y.get(0) + y.get(y.size()-1);

            result[i] = width * height;
        }

        for (int i = 0; i < t; i++)
            System.out.println(result[i]);
    }
}