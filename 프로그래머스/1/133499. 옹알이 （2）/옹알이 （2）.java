class Solution {
    static String[] b = {"aya", "ye", "woo", "ma"};
    static String[] bb = {"ayaaya", "yeye", "woowoo", "mama"};
    static int count = 0;
    
    public int solution(String[] babbling) {
        
        O: for (int i = 0; i < babbling.length; i++) {
            
            String x = babbling[i];
            
            for (int j = 0; j < 4; j++) {
                
                if (x.contains(bb[j])) continue O;
            }
            
            for (String bab : b) {
                x = x.replace(bab, " ");
            }
            
            x = x.replace(" ", "");
            
            if (x.length() == 0) count++;
        }
        
        return count;
    }
}