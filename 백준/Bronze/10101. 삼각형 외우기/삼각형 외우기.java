import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        int three = Integer.parseInt(br.readLine());

        int sum = one + three + two;

        if (one == two && one == three && one == 60) {
            bw.write("Equilateral");
        } else if (sum != 180) {
            bw.write("Error");
        } else if (one != two && one !=three && two != three) {
            bw.write("Scalene");
        } else
            bw.write("Isosceles");

        bw.flush();
        bw.close();
    }
}