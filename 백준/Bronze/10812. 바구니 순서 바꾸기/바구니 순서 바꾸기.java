import java.util.Scanner;

public class Main {
    static void swap(int bag[], int begin, int end, int mid){
        int[] t = new int[mid-begin];
        for(int i = 0; i < t.length; i++)
        {
            t[i] = bag[begin-1+i];
        }

        for(int i = 0; i <= end-mid; i++)
        {
            bag[begin-1+i] = bag[mid-1+i];
        }

        for(int i = 0; i < t.length; i++)
        {
            bag[end-mid+begin+i] = t[i];
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt(); // 바구니 개수

        // 바구니 생성
        int[] bag = new int[n];
        for(int i = 0; i < bag.length; i++)
        {
            bag[i] = i+1;
        }

        int m = stdIn.nextInt(); // 회전 횟수
        int changeNum = 0; // 회전 횟수 조절
        int begin, mid, end;

        do{
            begin = stdIn.nextInt();
            end = stdIn.nextInt();
            mid = stdIn.nextInt();

            swap(bag,begin,end,mid);

            changeNum++;
        }while (m > changeNum);

        for(int i = 0; i < bag.length; i++)
        {
            System.out.print(bag[i] + " ");
        }
    }
}