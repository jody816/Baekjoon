import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++)
        {
            String x = br.readLine();
            
            if (!arr.contains(x))
                arr.add(x);
        }

        arr.sort(Comparator.comparingInt(String::length));

        ArrayList<String> check = new ArrayList<>();

        int checkLength = arr.get(0).length();

        for (int i = 0; i < arr.size(); i++)
        {
            if (arr.get(i).length() == checkLength) {
                check.add(arr.get(i));
            } else {
                checkLength = arr.get(i).length();

                Collections.sort(check);

                if (check.size() > 0)
                    for (String s : check) bw.write(s + "\n");

                check.clear();

                i--;
            }
        }

        Collections.sort(check);

        if (check.size() > 0)
            for (String s : check) bw.write(s + "\n");
        
        bw.flush();
        bw.close();
    }
}