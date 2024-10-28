import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        int hIndex = citations.length;
        
        Arrays.sort(citations);
        
        for (int i = 0; i < citations.length; i++) {
            
            if (citations[i] >= hIndex) {
                return hIndex;
            } else {
                hIndex--;
            }
        }
        
        return 0;
    }
}