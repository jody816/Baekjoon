import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    static String num;
    static boolean[] visit;
    static String[] numArr;
    public int solution(String numbers) {
        
        num = numbers;
        numArr = num.split("");
        visit = new boolean[num.length()];
        dfs(0, "");
        
        int result = 0;
        
        for (int i : set) {
            if (isPrime(i)) {
                result++;
            }
        }
        
        return result;
    }
    
    static void dfs(int depth, String str) {
        if (depth == num.length()) {
            return;
        }
        
        for (int i = 0; i < numArr.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                String n = str + numArr[i];
                set.add(Integer.parseInt(n));
                dfs(depth, n);
                visit[i] = false;
            }
        }
    }
    
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}