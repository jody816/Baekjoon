import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int yt = stdIn.nextInt();
        int yj = stdIn.nextInt();

        while (true){
            yj += yt;
            if(yj > 4){
                System.out.println("yt");
                break;
            }

            yt += yj;
            if (yt > 4){
                System.out.println("yj");
                break;
            }
        }
    }
}