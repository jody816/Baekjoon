class Solution {
    public String solution(String s) {
        if (s.length() % 2 == 0) {
            StringBuilder sb = new StringBuilder();
            int a = s.length()/2;
            sb.append(s.charAt(a-1));
            sb.append(s.charAt(a));
            
            return sb.toString();
        } else {
            return String.valueOf(s.charAt(s.length()/2));
        }
    }
}