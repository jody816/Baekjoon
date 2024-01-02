import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String[] x = s.split("");

        Arrays.sort(x, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (String c : x)
            result.append(c);

        return result.toString();
    
    }
}