import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String[] array = br.readLine().split(" ");
        int[] score = new int[n];
        for (int i = 0; i < array.length; i++)
        {
            score[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(score);

        bw.write(score[n-k] + "");
        bw.flush();
        bw.close();
    }
}