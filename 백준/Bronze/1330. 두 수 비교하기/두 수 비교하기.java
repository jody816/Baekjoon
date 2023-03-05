import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a, b;
        
        do {
            a = stdIn.nextInt();
        } while (a > 10000 || a < -10000);
        
        do {
          b = stdIn.nextInt();  
        } while (b > 10000 || b < -10000);
        
        if (a > b)
            System.out.print(">");
        else if (a < b) {
            System.out.print("<");
        } else 
            System.out.print("==");
    }
}