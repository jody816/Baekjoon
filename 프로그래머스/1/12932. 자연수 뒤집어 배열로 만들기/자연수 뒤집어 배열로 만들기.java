import java.util.ArrayList;
class Solution {
    public int[] solution(long n) {
        
        if (n < 10) {
            int[] v = new int[1];
            v[0] = (int) n;
            return v;
        }
        
        ArrayList<Long> a = new ArrayList<>();
        long x = 10;
        long b = 1;
        while (n >= 10) {
            long check = n % x;

            long g = check / b;

            a.add(g);

            n -= check;
            x *= 10;
            b *= 10;
        }

        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = Math.toIntExact(a.get(i));
        }

        return answer;
    }
}