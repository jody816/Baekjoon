class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
       String[] x = s.split("");
       for (int i = 0; i < x.length; i++) {
         if (!x[i].equals(" ")) {
           char a = x[i].charAt(0);
           for (int j = 0; j < n; j++) {
             if (a == 'z')
               a = 'a';
             else if (a == 'Z') {
               a = 'A';
             } else
               a++;
           }
           x[i] = String.valueOf(a);
         }
         sb.append(x[i]);
       }
       return sb.toString();
    }
}