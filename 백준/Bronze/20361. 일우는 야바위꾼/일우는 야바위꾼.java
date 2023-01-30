import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void swap(int[] cup, int fc, int sc){
        if (cup[fc-1] == 1 && cup[sc-1] == 0){
            cup[fc-1]--;
            cup[sc-1]++;
        } else if (cup[fc-1] == 0 && cup[sc-1] == 1) {
            cup[fc-1]++;
            cup[sc-1]--;
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt(); // 컵의 개수
        int[] cup = new int[n];

        int x = stdIn.nextInt(); // 처음 공을 숨기는 위치
        for(int i = 0; i < n; i++) {
            if (i == (x - 1))
                cup[i] = 1; // 공이 있으면 1
            else
                cup[i] = 0; // 없으면 0
        }

        int k = stdIn.nextInt(); // 컵을 바꾸는 횟수
        int test = 0;   // 횟수 제한

        int firstCup, secondCup; // 고르는 컵
        do {
            firstCup = stdIn.nextInt();
            secondCup = stdIn.nextInt();
            swap(cup,firstCup,secondCup);
            test++;
        }while (test < k);

        for(int i = 0; i < n; i++) {
            if (cup[i] == 1){
                System.out.print(i+1);
                break;
            }
        }
    }
}