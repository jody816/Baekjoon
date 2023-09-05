import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        HashMap<Integer, String> pokemon = new HashMap<>();
        HashMap<String, Integer> pokemon2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String x = br.readLine();

            pokemon.put(i, x);
            pokemon2.put(x, i);
        }

        for (int i = 0; i < m; i++)
        {
            String x = br.readLine();

            try {
                int find = Integer.parseInt(x);

                bw.write(pokemon.get(find) + "\n");
            } catch (Exception e) {
                bw.write(pokemon2.get(x) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}