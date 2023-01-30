import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random random = new Random();

        int firstTime, secondTime, thirdTime, sum = 0;

        int meatTemp = stdIn.nextInt(); // 처음 고기의 온도

        int goalTemp = stdIn.nextInt(); // 목표 온도

        int frozenMelt; // 처음 고기 온도가 0일 때
                            // 얼었는가 얼지 않았는가

        if(meatTemp < 0){
            firstTime = stdIn.nextInt();
            for(int i = 0; i < meatTemp*(-1); i++){
                sum += firstTime;
            }
            meatTemp = 0;

            secondTime = stdIn.nextInt();
            sum += secondTime;

            thirdTime = stdIn.nextInt();
            sum += thirdTime * goalTemp;
        } else if (meatTemp > 0) {
            firstTime = stdIn.nextInt();
            secondTime = stdIn.nextInt();
            thirdTime = stdIn.nextInt();

            sum = (goalTemp - meatTemp) * thirdTime;
        } else {
            firstTime = stdIn.nextInt();

            frozenMelt = random.nextInt(2);
            secondTime = stdIn.nextInt();
            if(frozenMelt == 1){
                sum += secondTime;
            }

            thirdTime = stdIn.nextInt();
            sum += thirdTime * goalTemp;
        }

        System.out.println(sum);
    }
}