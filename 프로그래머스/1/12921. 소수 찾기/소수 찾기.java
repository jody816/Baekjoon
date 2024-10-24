import java.util.*;

class Solution {
    
    static boolean[] isPrime;
    
    public int solution(int n) {
        
        isPrime = new boolean[n+1];
        
        Arrays.fill(isPrime, true);
        
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                
                for (int j = i*i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (boolean b : isPrime) {
            
            if (b) count++;
        }
        
        return count;
    }
}