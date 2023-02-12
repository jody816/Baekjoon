import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int t;
        do {
            t = stdIn.nextInt();
        }while (t > 100 || t < 1);

        ArrayList<String> oneNum = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        int n;
        for (int i = 0; i < t; i++) {
            do {
                n = stdIn.nextInt();
            } while (n > 200 || n < 0);

            if (n == 0){
                result.add("INSOMNIA");
                continue;
            }

            int plus = 1;
            String number = "";

            while (true){
                if (oneNum.size() == 10){
                    result.add(number);
                    oneNum.clear();
                    break;
                }

                number = String.valueOf(plus*n);

                for (int j = 0; j < number.length(); j++)
                {
                    if (!(oneNum.contains(String.valueOf(number.charAt(j))))){
                        oneNum.add(String.valueOf(number.charAt(j)));
                    }
                }

                plus++;
            }
        }

        for (int i = 0; i < result.size(); i++)
        {
            System.out.println("Case #" + (i+1) + ": " + result.get(i));
        }
    }
}