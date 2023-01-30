import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        String result = "";

        for(int i = 4; i <= n; i++)
        {
            String a = String.valueOf(i);

            if(!(a.contains("1") || a.contains("2")
                    || a.contains("3") || a.contains("5")
                    || a.contains("6") || a.contains("8")
                    || a.contains("9") || a.contains("0"))) {
                result = a;
            }
        }
        System.out.print(result);
    }
}