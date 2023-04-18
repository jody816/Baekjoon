import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String[][] array = new String[5][15];

        for (int i = 0; i < 5; i++)
        {
            String x = stdIn.next();

            array[i] = x.split("");
        }

        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                try {
                    System.out.print(array[j][i]);
                } catch (Exception e) {
                    System.out.print("");
                }
            }
        }
    }
}