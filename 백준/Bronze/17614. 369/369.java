import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt(); // 게임의 마지막 번호

        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            String a = String.valueOf(i);

            for(int j = 0; j <= a.length()-1; j++) {
                if (a.charAt(j) == '3') {
                    count++;
                } else if (a.charAt(j) == '6') {
                    count++;
                } else if (a.charAt(j) == '9') {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}