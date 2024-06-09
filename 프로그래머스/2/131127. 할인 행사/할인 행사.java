import java.util.*;

class Solution {
    static int answer = 0;
    public int solution(String[] want, int[] number, String[] discount) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for (int i = 0; i < discount.length; i++) {
            if (map.containsKey(discount[i])) {
                Map<String, Integer> copyMap = new HashMap<>(map);
                check(copyMap, i, discount);
            }
        }
        
        return answer != 0 ? answer : 0;
    }
    
    static private void check(Map<String, Integer> map, int start, String[] discount) {
        for (int i = start; i < start+10; i++) {
            if (i == discount.length) {
                return;
            }
            
            if (map.containsKey(discount[i])) {
                map.put(discount[i], map.get(discount[i])-1);
            }
            
            if (Collections.max(map.values()) == 0) {
                answer++;
                return;
            }
        }
    }
}