import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(" ");

        int n = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            if(n % b < 10){
                sb.append(n % b);
            } else {
                sb.append((char)(n % b - 10 + 'A'));
            }
            n /= b;
        }

        bw.write(sb.reverse() + "");
        bw.flush();
        bw.close();
    }
}