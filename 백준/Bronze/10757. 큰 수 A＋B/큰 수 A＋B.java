import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    BigInteger a = new BigInteger(st.nextToken());
    BigInteger b = new BigInteger(st.nextToken());

    a = a.add(b);

    bw.write(a + " ");
    bw.flush();
    bw.close();
  }
}
