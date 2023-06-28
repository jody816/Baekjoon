import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String m = br.readLine();
        String[] array = m.split("");

        for (int i = 0; i <= array.length/2; i++)
        {
            if (!array[i].equals(array[array.length-i-1])) {
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");
    }
}