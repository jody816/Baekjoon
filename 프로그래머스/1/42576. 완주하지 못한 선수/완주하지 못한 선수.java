import java.util.*;
import java.util.Map.Entry;

class Solution {
    
    static Map<String, Integer> map = new HashMap<>();
    
    public String solution(String[] participant, String[] completion) {
       
        for (String key : participant) {
            map.put(key, map.getOrDefault(key, 1) + 1);
        }
        
        for (String key : completion) {
            map.put(key, map.get(key) - 1);
        }
        
        int max = Collections.max(map.values());
        
        for (Entry<String, Integer> entrySet : map.entrySet()) {
            
            if (entrySet.getValue() == max) {
                return entrySet.getKey();
            }
        }
        
        return null;
    }
}