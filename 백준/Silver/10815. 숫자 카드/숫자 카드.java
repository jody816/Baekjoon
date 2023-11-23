import java.io.*;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] num = br.readLine().split(" ");

        HashSet<String> numbers = new HashSet<>(List.of(num));

        int m = Integer.parseInt(br.readLine());

        String[] cards = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            if (numbers.contains(cards[i]))
                bw.write(1 + " ");
            else
                bw.write(0 + " ");
        }

        bw.flush();
        bw.close();
    }
}
