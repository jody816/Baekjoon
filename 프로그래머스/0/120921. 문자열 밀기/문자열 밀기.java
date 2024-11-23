class Solution {
    public int solution(String A, String B) {
        
        StringBuilder sb = new StringBuilder(B);
        
        int count = 0;
        while (!A.equals(sb.toString())) {
            
            if (count > A.length()) {
                count = -1;
                break;
            }
            
            char x = sb.charAt(0);
            
            sb.deleteCharAt(0);
            
            sb.append(x);
            count++;
        }
        
        return count;
    }
}