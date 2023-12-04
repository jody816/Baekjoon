import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);

        String[][] map = new String[r][c];

        for (int i = 0; i < r; i++) {
            String[] x = br.readLine().split("");

            System.arraycopy(x, 0, map[i], 0, c);
        }

        ArrayList<Integer> find = new ArrayList<>();

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                int count = 0;
                if (map[i][j].equals("X")) {
                    for (int k = 0; k < 4; k++)
                    {
                        try {
                            switch (k) {
                                case 0:
                                    if (map[i][j-1].equals("."))
                                        count++;
                                    break;

                                case 1:
                                    if (map[i][j+1].equals("."))
                                        count++;
                                    break;

                                case 2:
                                    if (map[i+1][j].equals("."))
                                        count++;
                                    break;

                                case 3:
                                    if (map[i-1][j].equals("."))
                                        count++;
                                    break;
                            }
                        } catch (Exception e) {
                            count++;
                        }
                        if (count > 2) {
                            find.add(i);
                            find.add(j);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < find.size()-1; i+=2) {
            map[find.get(i)][find.get(i+1)] = ".";
        }

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j].equals("X")) {
                    a.add(i);
                    b.add(j);
                }
            }
        }

        Collections.sort(b);

        for (int i = a.get(0); i <= a.get(a.size()-1); i++) {
            for (int j = b.get(0); j <= b.get(b.size() - 1); j++) {
                bw.write(map[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
