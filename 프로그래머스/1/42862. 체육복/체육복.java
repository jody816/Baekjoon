import java.util.*;
class Solution {
    static int[] arr;
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        arr = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
            arr[i] = 1;
        }
        
        for (int i : lost) {
            arr[i] = 0;
        }
        
        for (int i : reserve) {
            arr[i]++;
        }
        
        for (int i = 1; i < n; i++) {
            if (arr[i] == 0 && arr[i+1] == 2) {
                arr[i]++;
                arr[i+1]--;
            } else if (arr[i] == 2 && arr[i+1] == 0) {
                arr[i]--;
                arr[i+1]++;
            }
            
            if (arr[i] >= 1) {
                answer++;
            }
        }
        
        if (arr[n] >= 1) {
            answer++;
        }
        
        return answer;
    }
}