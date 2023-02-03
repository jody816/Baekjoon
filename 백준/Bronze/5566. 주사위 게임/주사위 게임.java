import java.util.Scanner;

public class Main {
    public static void main(String[] arga){
        Scanner stdIn = new Scanner(System.in);

        int n;  // 보드판 칸
        int m;  // 주사위를 던진 횟수

        // 칸 정수 받기
        do{
            n = stdIn.nextInt();
        }while (n > 1000 || n < 2);
        int[] board = new int[n];

        // 주사위 던진 횟수 정수 받기
        do {
            m = stdIn.nextInt();
        }while (m > 1000 || m < 1);

        // 지시사항
        int x;
        for(int i = 0; i < board.length; i++){
            do {
                x = stdIn.nextInt();
            }while (x > 999 || x < -999);
            board[i] = x;
        }

        // 던져서 나온 주사위의 눈 받기
        int[] dice = new int[m];
        int d;
        for(int i = 0; i < dice.length; i++){
            do {
                d = stdIn.nextInt();
            }while (d > 6 || d < 1);
            dice[i] = d;
        }

        // 말의 이동 및 결과 출력
        int horse = 0;
        for (int i = 0; i < dice.length; i++) {
            horse += dice[i];
            if (horse >= board.length - 1) {
                System.out.print(i + 1);
                break;
            } else {
                horse += board[horse];
                if (horse >= board.length - 1) {
                    System.out.print(i + 1);
                    break;
                } else if (horse <= 0) {
                    horse = 0;
                }
            }
        }
    }
}