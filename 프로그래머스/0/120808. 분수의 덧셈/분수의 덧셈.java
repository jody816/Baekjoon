import java.util.stream.IntStream;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int n = numer1 * denom2 + numer2 * denom1;
        int d = denom1 * denom2;
        
        int g = (int) IntStream.rangeClosed(1, Math.min(n, d))
            .filter(i -> n % i == 0 && d % i == 0)
            .max()
            .getAsInt();
        
        return new int[] {n / g, d / g};
    }
}