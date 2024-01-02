class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

       int f = 0;
       for (int i = 0; i < s.length(); i++) {

         if (s.charAt(i) == ' ') {
           f = 0;
           sb.append(s.charAt(i));
         } else {
           if (f%2==0) {
             sb.append(String.valueOf(s.charAt(i)).toUpperCase());
           } else {
                          sb.append(String.valueOf(s.charAt(i)).toLowerCase());
           }
           f++;
         }
       }
       return sb.toString();
    }
}