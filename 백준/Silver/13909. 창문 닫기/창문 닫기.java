import java.io.*;

class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int count = 1;
    for (int i = 2; i*i <= n; i++) {
      count++;
    }

    bw.write(String.valueOf(count));
    bw.flush();
    bw.close();
  }
}
