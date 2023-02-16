import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x;
        do {
            x = stdIn.nextInt();
        }while (x > 64 || x < 1);

        ArrayList<Integer> woods = new ArrayList<>();

        int wood = 64;
        do {
            woods.add(wood);

            wood = wood / 2;
        } while (wood != 0);

        while (true){
            if (woods.get(0) > x)
                woods.remove(0);
            else {
                break;
            }
        }

        int count = 1;
        for (int i = 0; i < woods.size(); i++)
        {
            if (woods.get(i) == x) {
                System.out.println(1);
                return;
            }
        }

        int sum = woods.get(0);
        for (int j = 1; j < woods.size(); j++){
            sum += woods.get(j);
            count++;
            if (sum > x){
                sum -= woods.get(j);
                count--;
            }

            if (sum == x)
                break;
        }

        System.out.println(count);
    }
}