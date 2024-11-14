import java.text.ParseException;
import java.text.SimpleDateFormat;
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

      String x = br.readLine().trim();

      bw.write("#" + i + " " + formatDate(x) + "\n");
    }

    bw.flush();
    bw.close();
  }

  private static String formatDate(String date) {
    String y = date.substring(0, 4);
    String m = date.substring(4, 6);
    String d = date.substring(6, 8);

    if (isValidDate(date)) {
      return y + "/" + m + "/" + d;
    } else {
      return "-1";
    }
  }

  private static boolean isValidDate(String date) {

    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    format.setLenient(false);

    try {
      format.parse(date);
      return true;
    } catch (ParseException e) {
      return false;
    }
  }
}
