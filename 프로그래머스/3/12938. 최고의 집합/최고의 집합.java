import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        
        if (n > s) return new int[]{-1};
        
        int[] result = new int[n];
        
        int idx = 0;
        while (s != 0) {
            
            int num = s/n;
        
            result[idx++] = num;
            
            s -= num;
            n--;
        }
        
        
        Arrays.sort(result);
        
        return result;
    }
}