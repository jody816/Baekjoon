import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int h, w;
        do {
            h = stdIn.nextInt();
        }while (h > 100 || h < 1);
        do {
            w = stdIn.nextInt();
        }while (w > 100 || w < 1);

        int[][] result = new int[h][w];

        for (int i = 0; i < h; i++) {
            String input;
            do {
                input = stdIn.next();
            } while (input.length() != w);

            int plus = -1;
            for (int j = 0; j < w; j++) {
                if (input.charAt(j) == '.' && plus > 0) {
                    result[i][j] = plus++;
                }else if(input.charAt(j) == 'c'){
                    result[i][j] = 0;
                    plus = 1;
                }else {
                    result[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}