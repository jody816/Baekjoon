import java.util.*;

class Solution {
    
    static LinkedHashSet<Integer> set = new LinkedHashSet<>();
    
    public int[] solution(String s) {
        
        s = s.substring(2, s.length()-2);
        
        String[] elements = s.split("},\\{");

        Arrays.sort(elements, (a, b) -> a.length() - b.length());
        
        for (String element : elements) {
            String[] numbers = element.split(",");
            for (String number : numbers) {
                set.add(Integer.parseInt(number));
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}