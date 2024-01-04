import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

       for (int i = 0; i < result.length; i++) {
         int[] x = new int[commands[i][1]-commands[i][0]+1];
         int n = 0;
         for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
           x[n++] = array[j];
         }
         Arrays.sort(x);
         result[i] = x[commands[i][2]-1];
       }

       return result;
    }
}