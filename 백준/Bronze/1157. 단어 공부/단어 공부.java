import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String m = br.readLine();
        m = m.toLowerCase();

        String[] array = m.split("");

        ArrayList<String> e = new ArrayList<>();

        for (String s : array)
            if (!e.contains(s))
                e.add(s);

        String find = "";

        ArrayList<Integer> findResult = new ArrayList<>();

        for (int i = 0; i < e.size(); i++)
        {
            findResult.add(Collections.frequency(Arrays.asList(array), e.get(i)));
        }

        Collections.sort(findResult);

        if (Collections.frequency(findResult, findResult.get(findResult.size()-1)) > 1)
            bw.write("?");
        else {
            for (int i = 0; i < array.length; i++)
            {
                if (Collections.frequency(Arrays.asList(array), array[i]) == findResult.get(findResult.size()-1)) {
                    find = array[i];
                    break;
                }
            }
            bw.write(find.toUpperCase()+"");
        }

        bw.flush();
        bw.close();
    }
}