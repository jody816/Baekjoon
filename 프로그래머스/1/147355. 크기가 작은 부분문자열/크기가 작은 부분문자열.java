class Solution {
    public int solution(String t, String p) {
        int length = p.length();

       int count = 0;

       for (int i = 0; i <= t.length()-length; i++) {
         StringBuilder sb = new StringBuilder();
         for (int j = i; j < i+length; j++) {
           sb.append(t.charAt(j));
         }

       if (Long.parseLong(sb.toString()) <= Long.parseLong(p))
           count++;
       }

       return count;
    }
}