class Solution {
    public long[] solution(int n, long left, long right) {
        
        long[] result = new long[(int)right - (int)left + 1];
        
        int idx = 0;
        for (long i = left; i <= right; i++) {
            result[idx++] = Math.max(i/n, i%n) + 1;
        }
        
        return result;
    }
}