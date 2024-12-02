import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int input = Integer.parseInt(br.readLine());

    int count = 0;

    while (input >= 5) {

      count += input/5;
      input /= 5;
    }

    bw.write(String.valueOf(count));
    bw.flush();
  }
}
