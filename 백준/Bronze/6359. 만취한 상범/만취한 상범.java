import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int people(int n, int[] room, int[] result, int test){
        for (int i = 1; i <= n; i++)
        {
            for(int j = 0; i+j-1 < n; j+=i){
                if(room[i+j-1] == 1)
                    room[i+j-1] = 0;
                else
                    room[i+j-1] = 1;
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            if(room[i] == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt();    // 테스트 수
        int test = 0;   // 테스트 조절
        int[] result = new int[t];

        int n;    // 방 개수
        do{
            n = stdIn.nextInt();

            int[] room = new int[n];
            for(int i = 0; i < n; i++) {
                room[i] = 1; // 1을 채워줌(닫힘)
            }

            result[test] = people(n,room,result,test);
            test++;
        }while (t > test);

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}