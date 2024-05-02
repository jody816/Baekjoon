import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    
    static Map<String, Integer> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    
    public int[] solution(String today, String[] terms, String[] privacies) {

      for (String i : terms) {
        String[] term = i.split(" ");

        map.put(term[0], Integer.parseInt(term[1]));
      }

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
      LocalDate Today = LocalDate.parse(today, formatter);

      System.out.println("Today = " + Today);

      for (int i = 0; i < privacies.length; i++) {

        String[] privacy = privacies[i].split(" ");

        LocalDate date = LocalDate.parse(privacy[0], formatter).plusMonths(map.get(privacy[1])).minusDays(1);

        System.out.println("date = " + date);

        if (date.isBefore(Today)) {
          sb.append(i+1).append(" ");
        }
      }

      return Arrays.stream(sb.toString().split(" "))
          .mapToInt(Integer::parseInt).toArray();
    }
}