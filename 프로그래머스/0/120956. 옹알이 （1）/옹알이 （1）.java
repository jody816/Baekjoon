class Solution {
    public int solution(String[] babbling) {
        String[] words = new String[]{"aya", "ye", "woo", "ma"};
        
        int count = 0;
        for (String bab : babbling) {
            
            String b = bab;
            for (String word : words) {
                
                if (b.contains(word)) {
                    
                    b = b.replace(word, " ");
                }
            }
            
            if (b.trim().length() == 0) {
                count++;
            }
        }
        
        return count;
    }
}