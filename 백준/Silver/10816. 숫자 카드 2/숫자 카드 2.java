import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (map.containsKey(num[i])) {
                map.replace(num[i], map.get(num[i])+1);
            } else map.put(num[i], 1);
        }

        int m = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            if (!map.containsKey(cards[i])) {
                bw.write(0 + " ");
                continue;
            }
            bw.write(map.get(cards[i]) + " ");
        }

        bw.flush();
        bw.close();
    }
}
