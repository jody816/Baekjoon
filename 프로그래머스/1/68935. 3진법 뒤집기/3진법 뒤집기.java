class Solution {
    public int solution(int n) {
        String a = Integer.toString(n,3);

       StringBuilder sb = new StringBuilder();
       for (int i = a.length()-1; i >= 0; i--)
         sb.append(a.charAt(i));

       return Integer.parseInt(sb.toString(), 3);
    }
}