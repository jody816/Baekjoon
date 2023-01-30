import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt(); // 단의 수
        int k = stdIn.nextInt(); // 항의 수

        String[] origin = new String[k];    // 구구단
        int[] reverse = new int[k];         // 거꾸로 구구단

        for(int i = 1; i <= k; i++)     // 구구단 생성
            origin[i-1] = String.valueOf(n*i);

        for(int i = 0; i < k; i++){     // 거꾸로 구구단 생성
            if (origin[i].length() == 1){
                reverse[i] = Integer.parseInt(origin[i]);
            }else {
                String a = "";
                for(int j = 0; j < origin[i].length(); j++){
                    a += origin[i].charAt(origin[i].length()-1-j);
                }
                reverse[i] = Integer.parseInt(a);
            }
        }

        Arrays.sort(reverse);
        System.out.print(reverse[k-1]);
    }
}