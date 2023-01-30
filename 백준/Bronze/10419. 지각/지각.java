import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void timeCalculation(int[] time, int[] result){

        for (int i = 0; i < time.length; i++)
        {
            if(time[i] == 0 || time[i] == 1)
                result[i] = 0;
            else {
                int s = 1;
                while (time[i] >= (s+s*s)) {
                    result[i] = s;
                    s++;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt(); // 창영이가 궁금한 경우의 수
        int test = 0;   // 경우의 수 조절

        int d;   // 수업시간

        int[] time = new int[t]; // 경우의 수 크기의 배열
        int[] result = new int[t]; // 결과를 저장할 배열

        do {
            d = stdIn.nextInt();
            time[test] = d;

            test++;
        }while (t > test);

        timeCalculation(time,result);

        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}