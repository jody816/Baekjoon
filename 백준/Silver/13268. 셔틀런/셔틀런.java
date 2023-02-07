import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int stamina;
        do {
            stamina = stdIn.nextInt();
        }while (stamina > 10000);

        int canRun = stamina % 100;

        int distance = 0;

        for (int i = 0; i < canRun; i++)
        {
            if (i < 5){
                distance++;
            }else if (i < 10){
                distance--;
            } else if (i < 20) {
                distance++;
            } else if (i < 30) {
                distance--;
            } else if (i < 45) {
                distance++;
            } else if (i < 60){
                distance--;
            } else if (i < 80){
                distance++;
            } else {
                distance--;
            }
        }

        if (distance == 0){
            System.out.print(0);
        } else if (distance > 0 && distance <= 5) {
            System.out.print(1);
        } else if (distance > 5 && distance <= 10) {
            System.out.print(2);
        } else if (distance > 10 && distance <= 15) {
            System.out.print(3);
        } else if (distance > 15 && distance <= 20) {
            System.out.print(4);
        }
    }
}