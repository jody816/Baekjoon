import java.util.*;
import java.io.*;

class Solution
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine().trim());

    for (int i = 1; i <= n; i++) {
        String x = String.valueOf(i);
        
        int count = 0;
        
        for (char c : x.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
            	count++;
        	}
        }
        
        if (count > 0) {
            for (int j = 0; j < count; j++) {
                bw.write("-");
            }
            bw.write(" ");
        } else {
            bw.write(x + " ");
        }
    }

    bw.flush();
    bw.close();
  }
}
