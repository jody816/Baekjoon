import java.util.Scanner;

public class Main {
    // 공 바꾸는 메서드
    static void mixBag(int[][] bag,int firstBag, int secondBag){
        int t = bag[firstBag - 1][0];
        bag[firstBag - 1][0] = bag[secondBag - 1][0];
        bag[secondBag - 1][0] = t;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        try {
            int n = stdIn.nextInt();  // 바구니
            int m = stdIn.nextInt();  // 공 바꾸는 횟수

            // 초기 바구니와 공 생성
            int[][] bag = new int[n][1];
            for (int i = 0; i < n; i++) {
                bag[i][0] = i + 1;
            }

            int mixNum = 0; // 반복 횟수 조절

            do {
                int firstBag = stdIn.nextInt();
                int secondBag = stdIn.nextInt();
                mixBag(bag, firstBag, secondBag);
                mixNum++;
            } while (m > mixNum);

            for (int i = 0; i < bag.length; i++) {
                System.out.print(bag[i][0] + " ");
            }
        }catch (Exception e){
            System.out.println(e + "예외 처리");
        }
    }
}