import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void swap(int[][] cup, int x, int y){
        if(cup[0][x-1] == 1){
            --cup[0][x-1];
            ++cup[0][y-1];
        } else if (cup[0][y-1] == 1) {
            --cup[0][y-1];
            ++cup[0][x-1];
        } else if (cup[0][x-1] == cup[0][y-1]) {

        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int m = stdIn.nextInt();    // 컵 위치 바꾸는 횟수

        int[][] cup = new int[1][3]; // 컵 초기 상태

        cup[0][0] = 1;
        cup[0][1] = 0;
        cup[0][2] = 0;

        int test = 0;

        int x, y;

        do{
            x = stdIn.nextInt();
            y = stdIn.nextInt();

            swap(cup, x, y);

            test++;
        }while (m > test);

        for(int i = 0; i < 3; i++){
            if(cup[0][i] == 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}