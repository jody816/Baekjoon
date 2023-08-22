import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int[] s = new int[t];

        String[] x = br.readLine().split(" ");

        for (int i = 0; i < t; i++)
        {
            s[i] = Integer.parseInt(x[i]);
        }

        Arrays.sort(s);

        int n = Integer.parseInt(br.readLine());

        int min = 1, max = s[s.length-1];

        for (int i = 0; i < t; i++)
        {
            if (s[i] < n) {
                if (min < s[i])
                    min = s[i];
            } else if (n < s[i]){
                if (max > s[i])
                    max = s[i];
            } else if (n == s[i]) {
                bw.write(0 + "");
                bw.flush(); bw.close();
                return;
            }
        }

        int count = 0;

        if (n >= s[0])
            min += 1;

        for (int i = min; i <= n; i++)
        {
            for (int j = i+1; j < max; j++)
            {
                if (n <= j) {
                    count++;
                }
            }
        }

//        int count = 0;
//
//        for (int i = 0; i < t-1; i++)
//        {
//            int a = s[i]+1, b = s[i+1];
//
//            if (a > b)
//                break;
//
//            for (int j = a; j < b-1; j++)
//            {
//                for (int k = j+1; k < b; k++)
//                {
//                    int[] check = new int[2];
//
//                    check[0] = j;
//                    check[1] = k;
//
//                    if (check[0] <= n && n <= check[1]) {
//                        count++;
//                        System.out.println(count + ": " + check[0] + ", " + check[1]);
//                    }
//                }
//            }
//        }

        bw.write(count + "");

        bw.flush(); bw.close();
    }
}