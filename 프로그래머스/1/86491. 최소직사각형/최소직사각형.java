class Solution {
    public int solution(int[][] sizes) {
        int a = 0, b = 0;
       for (int[] size : sizes) {
         if (a < Math.max(size[0], size[1])) {
           a = Math.max(size[0], size[1]);
         }
         if (b < Math.min(size[0], size[1])) {
           b = Math.min(size[0], size[1]);
         }
       }
       return a*b;
    }
}