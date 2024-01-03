class Solution {
    static final String[][] num = {{"0", "zero"}, {"1", "one"},
      {"2", "two"}, {"3", "three"}, {"4", "four"}, {"5", "five"},
      {"6", "six"}, {"7", "seven"}, {"8", "eight"}, {"9", "nine"}};
    
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < s.length(); i++) {
         try {
           int x = Integer.parseInt(String.valueOf(s.charAt(i)));
           result.append(x);
         } catch (Exception e) {
           sb.append(s.charAt(i));

           if (sb.length() >= 3) {
             for (String[] strings : num) {
               if (strings[1].contentEquals(sb)) {
                 result.append(strings[0]);
                 sb = new StringBuilder();
                 break;
               }
             }
           }
         }
       }
       return Integer.parseInt(result.toString());
    }
}