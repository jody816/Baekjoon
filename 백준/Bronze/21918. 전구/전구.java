import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void bulbSwitch(int[] bulb, int a, int b, int c){
        switch (a){
            case 1: bulb[b-1] = c;
                    break;

            case 2: for (int i = b; i <= c; i++){
                        if(bulb[i-1] == 1){
                            bulb[i-1] = 0;
                        }else {
                            bulb[i-1] = 1;
                        }
                    }
                    break;

            case 3: for (int i = b; i <= c; i++){
                        bulb[i-1] = 0;
                    }
                    break;

            case 4: for (int i = b; i <= c; i++){
                        bulb[i-1] = 1;
                    }
                    break;
        }
    }

    public static void main(String[] arga){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int[] bulb = new int[n];

        int m = stdIn.nextInt();  // 명령어 개수

        int p;
        for(int i = 0; i < bulb.length; i++){
            do {
                p = stdIn.nextInt();
                bulb[i] = p;
            }while (p > 1 || p < 0);
        }

        int test = 0; // 실행 제한
        int a, b, c;

        do {
            a = stdIn.nextInt();
            b = stdIn.nextInt();
            c = stdIn.nextInt();

            bulbSwitch(bulb,a,b,c);

            test++;
        }while (m > test);

        for (int i = 0; i < bulb.length; i++){
            System.out.print(bulb[i] + " ");
        }
    }
}