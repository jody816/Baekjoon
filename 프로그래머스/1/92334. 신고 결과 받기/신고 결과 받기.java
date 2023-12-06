import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> board = new HashMap<>();
        for (String s : id_list)
            board.put(s, 0);

        Set<String> setReport = new HashSet<>(Arrays.asList(report));

        for (String s : setReport) {
            String[] x = s.split(" ");

            board.replace(x[1], board.get(x[1]) + 1);
        }

        for (String s : setReport) {
            String[] x = s.split(" ");

            if (board.get(x[1]) >= k) {

                for (int i = 0; i < id_list.length; i++) {
                    if (id_list[i].equals(x[0])) {
                        answer[i]++;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}