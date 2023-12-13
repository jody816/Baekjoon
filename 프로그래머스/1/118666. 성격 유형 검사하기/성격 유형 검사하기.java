import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        String[] pointer = {"RT", "CF", "JM", "AN"};

        for (int i = 0; i < survey.length; i++) {

            String a = String.valueOf(survey[i].charAt(0));
            String b = String.valueOf(survey[i].charAt(1));

            if (choices[i] < 4) {
                map.replace(a, map.get(a)+(4-choices[i]));
            } else if (choices[i] >  4) {
                map.replace(b, map.get(b)+(choices[i]-4));
            }
        }

        StringBuilder result = new StringBuilder();

        for (String s : pointer) {
            String a = String.valueOf(s.charAt(0));
            String b = String.valueOf(s.charAt(1));

            if (map.get(a) >= map.get(b))
                result.append(a);
            else
                result.append(b);
        }

        return result.toString();
    }
}