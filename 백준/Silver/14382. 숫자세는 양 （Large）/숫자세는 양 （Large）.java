import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        ArrayList<Integer> ss = new ArrayList<>();

        int t, n;

        int x;
        do {
            x = stdIn.nextInt();
        }while (x > 100 || x < 1);
        t = x;

        ArrayList<String> result = new ArrayList<>(t);

        for (int i = 0; i < t; i++)
        {
            int a = 1;

            do {
                x = stdIn.nextInt();
            }while (x > 1000000 || x < 0);
            n = x;

            while (true){
                if (n == 0){
                    result.add("INSOMNIA");
                    break;
                }

                String check = String.valueOf(a*n);

                for (int j = 0; j < check.length(); j++)
                {
                    char c = check.charAt(j);
                    if (!(ss.contains(Integer.parseInt(String.valueOf(c))))){
                        ss.add(Integer.parseInt(String.valueOf(c)));
                    }
                }

                if (ss.size() == 10){
                    result.add(check);
                    ss.clear();
                    break;
                }

                a++;
            }
        }

        for (int i = 0; i < result.size(); i++)
        {
            System.out.println("Case #" + (i+1) + ": " + result.get(i));
        }
    }
}