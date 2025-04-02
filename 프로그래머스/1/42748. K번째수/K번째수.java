import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] result = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int first = command[0];
            int last = command[1];
            int find = command[2];
            
            int[] arr = new int[last-first+1];
            
            for (int i = 0; i < arr.length; i++) {
                arr[i] = array[first-1+i];
            }
            
            Arrays.sort(arr);
            
            result[idx++] = arr[find-1];
        }
        
        return result;
    }
}