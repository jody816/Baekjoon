import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n; // 사람 수
        do {
            n = stdIn.nextInt();
        }while (n > 50 || n < 2);

        int[] weight = new int[n];
        int[] height = new int[n];

        // 인원수대로 입력 받아주고 결과값 저장
        int t = 0;
        do {
            int x, y;   // 몸무게와 키

            do {
                x = stdIn.nextInt(); // 몸무게
            }while (x < 10);
            weight[t] = x;

            do {
                y = stdIn.nextInt(); // 키
            }while (y > 200);
            height[t] = y;

            t++;
        }while (t < n);

        int[] result = new int[n];  // 출력할 결과 모음
        Arrays.fill(result, 1);

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (weight[i] < weight[j] && height[i] < height[j]){
                    result[i]++;
                }
            }
        }

        for (int j : result) System.out.print(j + " ");
    }
}