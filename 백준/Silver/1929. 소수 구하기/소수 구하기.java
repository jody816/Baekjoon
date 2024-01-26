import java.io.*;
import java.util.*;

public class Main {
    
    static int[] array = new int[1000001];
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i = 0; i < array.length; i++)
            array[i] = i;
        
        array[1] = 0;
        
        String[] input = br.readLine().split(" ");
        
        int first = Integer.parseInt(input[0]);
        int last = Integer.parseInt(input[1]);
        
        for (int i = 2; i < array.length; i++) {
            if (array[i] == 0) continue;
            
            for (int j = i*2; j < array.length; j+=i) {
                array[j] = 0;
            }
        }
        
        for (int i = first; i <= last; i++) {
            if (array[i] != 0) {
                bw.write(array[i] + "\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}