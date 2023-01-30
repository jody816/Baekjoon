import java.util.Scanner;

public class Main {
    static void swap(int[] card, int a, int b){
        int[] t = new int[b-a+1];

        for(int i = 0; i < t.length; i++)
        {
            t[i] = card[b-1-i];
        }

        for(int i = 0; i < t.length; i++)
        {
            card[a-1+i] = t[i];
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        // 카드 초기화
        int[] card = new int[20];

        for(int i = 0; i < card.length; i++)
        {
            card[i] = i+1;
        }

        int time = 0;   // 역배치 횟수

        int a, b;   // 구간

        do{
            a = stdIn.nextInt();
            b = stdIn.nextInt();

            swap(card, a, b);

            time++;
        }while (time < 10);

        for(int i = 0; i < card.length; i++)
        {
            System.out.print(card[i] + " ");
        }
    }
}