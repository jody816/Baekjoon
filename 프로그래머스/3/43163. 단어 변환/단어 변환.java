class Solution {
    
    static boolean[] visit;
    static int result = 0;
    public int solution(String begin, String target, String[] words) {
        
        visit = new boolean[words.length];
        dfs(begin, target, words, 0);
        
        return result;
    }
    
    static void dfs(String begin, String target, String[] words, int count) {
        
        if (begin.equals(target)) {
            result = count;
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            
            if (visit[i]) continue;
            
            int diff = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) != words[i].charAt(j)) {
                    diff++;
                }
            }
            
            if (diff == 1) {
                visit[i] = true;
                dfs(words[i], target, words, count+1);
                visit[i] = false;
            }
        }
    }
}