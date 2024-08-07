import java.util.*;
class Solution {
    static Set<String> set = new HashSet<>();
    static int max = 0;
    static boolean[] visit;
    public String solution(String number, int k) {
        visit = new boolean[number.length()];
        dfs(number, k, "");
        
        for (String i : set) {
            max = Math.max(max, Integer.parseInt(i));
        }
        
        return String.valueOf(max);
    }
    
    static void dfs(String number, int k, String depth) {
        if (depth.length()+1 == k) {
            if (!set.contains(depth)) {
                set.add(depth);
            }
            
            return;
        }
        
        for (int i = 0; i < number.length(); i++) {
            
            if (!visit[i]) {
                visit[i] = true;
                dfs(number, k, depth+String.valueOf(number.charAt(i)));
                visit[i] = false;
            }
        }
    }
}