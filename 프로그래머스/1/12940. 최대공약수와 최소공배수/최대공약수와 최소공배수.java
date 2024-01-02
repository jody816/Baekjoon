class Solution {
    public int[] solution(int n, int m) {
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        int[] result = new int[2];
        for (int i = b; i >= 1; i--) {
            
            if (a%i==0 && b%i==0) {
                result[0] = i;
                break;
            }
        }

        while (a%b != 0) {
            a += Math.max(n,m);
        }
        
        result[1] = a;
        
        return result;
    }
}