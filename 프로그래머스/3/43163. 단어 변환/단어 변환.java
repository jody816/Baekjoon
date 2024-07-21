class Solution {
    
    static boolean[] visit;
    static int count = 0;
    
    public int solution(String begin, String target, String[] words) {
        
        visit = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        return count;
    }
    
    static void dfs(String begin, String target, String[] words, int c) {
        
        if (begin.equals(target)) {
            count = c;
            System.out.println(c);
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            
            if (visit[i]) {
                continue;
            }
            
            int different = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) != words[i].charAt(j)) {
                    different++;
                }
            }
            
            if (different == 1) {
                visit[i] = true;
                dfs(words[i], target, words, c+1);
                visit[i] = false;
            }
        }
    }
}