class Solution {
    public long solution(long n) {
        
        long a = 1;
        
        while (true) {
            
            if (a*a > n) {
                return -1;
            } else if (a*a == n) {
                return (a+1)*(a+1);
            } else {
                a++;
            }
        }
    }
}