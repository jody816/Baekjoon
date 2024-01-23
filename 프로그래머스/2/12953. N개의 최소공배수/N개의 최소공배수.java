import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int x = arr[arr.length-1];
        
        O: while (true) {
            
            for (int i = 0; i < arr.length-1; i++) {
                
                if (x%arr[i] != 0) {
                    x += arr[arr.length-1];
                    continue O;
                }
            }
            
            return x;
        }
    }
}