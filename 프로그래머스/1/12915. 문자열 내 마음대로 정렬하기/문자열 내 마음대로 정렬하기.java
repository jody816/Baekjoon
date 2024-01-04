import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.length() > n && s2.length() > n) {
                char char1 = s1.charAt(n);
                char char2 = s2.charAt(n);

                if (char1 != char2) {
                    return Character.compare(char1, char2);
                } else {
                    return s1.compareTo(s2);
                }
            } else {
                return s1.length() - s2.length();
            }
        });

        return strings;
    }
}