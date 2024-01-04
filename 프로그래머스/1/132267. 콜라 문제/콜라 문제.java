class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
       int rest = 0;

       while (n+rest >= a) {
         answer += (n/a)*b;
         rest += n%a;

         n = (n/a)*b;

         if (n < a) {
           n += rest;
           rest = 0;
         }
       }

       return answer;
    }
}