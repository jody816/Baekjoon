import java.util.*;

class Solution {
    
    public String solution(String number, int k) {
        char[] arr = number.toCharArray();

        StringBuilder sb = new StringBuilder();
        
        int len = number.length() - k;
        
        int checkIdx = 0;

        // (7758)41
        // 7 (7584)1
        // 77 (5841)
        // 778 (41)
        // 7784
        
        for(int i = 0; i < len; i++) {
            char max = '0';
            for (int j = checkIdx; j <= i + k; j++) {
                
                // System.out.print(arr[i] + " ");
                if (max < arr[j]) {
                    checkIdx = j + 1;
                    max = arr[j];
                }
                // System.out.println();
            }
            
            sb.append(max);
        }
        
        return sb.toString();
    }
}