import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(today, formatter);

        int[] result = new int[privacies.length];

        int count = 0;

        for (int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            LocalDate pDate = LocalDate.parse(p[0], formatter);

            for (String term : terms) {
                String[] t = term.split(" ");

                if (p[1].equals(t[0])) {
                    if (date.isBefore(pDate.plusMonths(Integer.parseInt(t[1])))) {
                        result[i] = i + 1;
                        count++;
                        break;
                    }
                }
            }
        }

        int[] r = new int[privacies.length-count];
        int c = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0)
                r[c++] = i+1;
        }
        return r;
    }
}