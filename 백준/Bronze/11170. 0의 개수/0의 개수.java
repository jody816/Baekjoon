import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void countZero(int n, int m, int[] result, int test){
        int count = 0;

        for(int i = n; i <= m; i++){
            String check = String.valueOf(i);

            for(int j = 0; j < check.length(); j++){
                if(check.charAt(check.length()-1-j) == '0'){
                    count++;
                }
            }
        }

        result[test] = count;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt(); // 케이스의 수
        int[] result = new int[t]; // 결과를 출력할 배열

        int test = 0;   // 입력 제한

        int n, m;
        do{
            n = stdIn.nextInt();
            m = stdIn.nextInt();

            countZero(n,m,result, test);

            test++;
        }while (t > test);

        for(int i = 0; i < t; i++)
            System.out.println(result[i]);
    }
}