import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            String x = "";
            for (int j = 0; j < a; j++) {
                x += "*";
            }
            System.out.println(x);
        }
    }
}