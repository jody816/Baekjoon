import java.util.*;

class Solution {
    
    Set<Integer> set = new HashSet<>();
    
    public int[] solution(int l, int r) {
        
        O: for (int i = l; i <= r; i++) {
            String x = String.valueOf(i);
            
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) != '0' && x.charAt(j) != '5') {
                    continue O;
                }
            }
            
            set.add(i);
        }
        
        int[] result;
        
        if (set.size() > 0) {
            result = new int[set.size()];
            
            int idx = 0;
            for (int i : set) {
                result[idx++] = i;
            }
            
            Arrays.sort(result);
        } else {
            result = new int[]{-1};
        }
        
        return result;
    }
}