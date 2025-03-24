import java.util.*;

class Solution {
    
    static int[] result;
    public int[] solution(int[] array, int[][] commands) {
        
        result = new int[commands.length];
        
        int idx = 0;
        O: for (int[] command : commands) {
            
            int first = command[0]-1;
            int last = command[1];
            int seq = command[2];
            
            int index = 0;
            int[] check = new int[last-first];
            for (int i = first; i < last; i++) {
                check[index++] = array[i];
            }
            
            Arrays.sort(check);
            
            result[idx++] = check[seq-1];
        }
        
        return result;
    }
}