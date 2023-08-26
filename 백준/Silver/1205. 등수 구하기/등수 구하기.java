import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int inputScore = Integer.parseInt(input[0]);
        int tae = Integer.parseInt(input[1]);
        int limit = Integer.parseInt(input[2]);

        if (inputScore == 0) {
            bw.write(1 + "");
            bw.flush();
            bw.close();
            return;
        }

        String[] scores = br.readLine().split(" ");

        ArrayList<Integer> board = new ArrayList<>();

        for (String score : scores)
            board.add(Integer.parseInt(score));
        
        board.add(tae);

        board.sort(Collections.reverseOrder());

        if (board.indexOf(tae) + Collections.frequency(board, tae) <= limit)
            bw.write((board.indexOf(tae) + 1) + "");
        else
            bw.write(-1 + "");

        bw.flush(); bw.close();
    }
}