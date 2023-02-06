import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a, t, aid;      // 사람, 구하고자 하는 번째, 구호

        do {
            a = stdIn.nextInt();
        }while (a > 2000);

        do {
            t = stdIn.nextInt();
        }while (t > 10000);

        do {
            aid = stdIn.nextInt();
        }while (aid > 1 || aid < 0);

        int person = -1;

        int bun = 0;
        int daeGi = 0;

        int plusBun = 2;
        int plusDaeGi = 2;

        while (true) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {      //i가 짝수일 때 뻔
                    bun++;
                    person++;
                    if (aid == 0 && bun == t) {
                        System.out.print(person % a);
                        return;
                    }
                } else {
                    daeGi++;
                    person++;
                    if (aid == 1 && daeGi == t) {
                        System.out.print(person % a);
                        return;
                    }
                }
            }

            for (int i = 0; i < plusBun; i++)
            {
                bun++;
                person++;
                if (aid == 0 && bun == t){
                    System.out.print(person % a);
                    return;
                }
            }

            for (int i = 0; i < plusDaeGi; i++)
            {
                daeGi++;
                person++;
                if (aid == 1 && daeGi == t){
                    System.out.print(person % a);
                    return;
                }
            }

            plusBun++;
            plusDaeGi++;
        }
    }
}