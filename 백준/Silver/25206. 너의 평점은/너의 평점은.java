import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Double> scores = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();

        double scoreSum = 0;
        String s;
        while ((s=br.readLine())!=null) {
            StringTokenizer st = new StringTokenizer(s);

            String lector = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!grade.equals("P")) {
                scores.add(score);
                grades.add(grade);
                scoreSum += score;
            }
        }

        double sum = 0;

        for (int i = 0; i < scores.size(); i++) {
            switch (grades.get(i)) {
                case "A+":
                    sum += scores.get(i) * 4.5;
                    break;

                case "A0":
                    sum += scores.get(i) * 4.0;
                    break;

                case "B+":
                    sum += scores.get(i) * 3.5;
                    break;

                case "B0":
                    sum += scores.get(i) * 3.0;
                    break;

                case "C+":
                    sum += scores.get(i) * 2.5;
                    break;

                case "C0":
                    sum += scores.get(i) * 2.0;
                    break;

                case "D+":
                    sum += scores.get(i) * 1.5;
                    break;

                case "D0":
                    sum += scores.get(i) * 1.0;
                    break;

                case "F":
                    sum += scores.get(i) * 0.0;
                    break;
            }
        }

        bw.write((sum / scoreSum) + "");
        bw.flush();
        bw.close();
    }
}