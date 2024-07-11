import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int result = 0;
        int flag = 0;
        int sum = people[flag];
        
        for (int i = people.length-1; i >= 0; i--) {
            if (flag >= i) {
                if (sum > 0) {
                    result++;
                }
                break;
            } else {
                sum = people[flag];
            }
            
            sum += people[i];
            
            if (sum > limit) {
                result++;
            } else if (sum == limit) {
                sum = 0;
                result++;
            } else {
                flag++;
            }
        }
        
        return result;
    }
}