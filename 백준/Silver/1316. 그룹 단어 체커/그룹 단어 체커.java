import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int count = 0;

        O: for (int i = 0; i < t; i++)
        {
            String word = br.readLine();

            String[] array = word.split("");
            ArrayList<String> arrayList = new ArrayList<>();
            for (String s : array) {
                if (!arrayList.contains(s)) {
                    arrayList.add(s);
                }
            }

            if (arrayList.size() == 1 || arrayList.size() == array.length) {
                count++;
            } else {
                int[][] check = new int[1][2];
                for (int j = 0; j < array.length; j++)
                {
                    for (int k = j; k < word.length(); k++)
                    {
                        if (array[j].equals(String.valueOf(word.charAt(k)))) {
                            if (check[0][1] > 0) {
                                continue O;
                            } else {
                                check[0][0]++;
                            }
                        } else {
                            check[0][1]++;
                        }
                    }
                    check[0][0] = 0;
                    check[0][1] = 0;
                }
                count++;
            }
        }

        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}