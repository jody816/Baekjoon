import java.math.BigInteger;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    BigInteger A = BigInteger.valueOf(Integer.parseInt(br.readLine()));

    A = A.multiply(BigInteger.valueOf(Integer.parseInt(br.readLine())));
    A = A.multiply(BigInteger.valueOf(Integer.parseInt(br.readLine())));

    String x = String.valueOf(A);

    int[] result = new int[10];

    for (int i = 0; i < x.length(); i++) {
      result[Integer.parseInt(String.valueOf(x.charAt(i)))]++;
    }

    for (int i = 0; i < 10; i++) {
      bw.write(result[i] + "\n");
    }

    bw.flush();
    bw.close();
  }
}
