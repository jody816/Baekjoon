import java.io.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    long[] numbers = new long[t];

    for (int i = 0; i < t; i++) {
      numbers[i] = Long.parseLong(br.readLine());
    }

    br.close();

    printSection(numbers);
  }

  private static void printSection(long[] numbers) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (long number : numbers) {
      BigInteger bigInteger = new BigInteger(String.valueOf(number));
      bw.write(findPrimeNumber(bigInteger) + "\n");
    }

    bw.flush();
    bw.close();
  }

  private static BigInteger findPrimeNumber(BigInteger bigInteger) {

    if (bigInteger.isProbablePrime(10)) {
      return bigInteger;
    }

    return bigInteger.nextProbablePrime();
  }
}
