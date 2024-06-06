import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            
            return o1[0] - o2[0];
        });
        
        // for (int i = 0; i < targets.length; i++) {
        //     System.out.print(targets[i][0] + ", " + targets[i][1] + "\n");
        // }
        
        // 두 번째
        int check = targets[0][1];
        
        int count = 0;
        
        for (int i = 1; i < targets.length; i++) {
            
            // 첫 번째 >= 두 번째
            if (targets[i][0] >= check) {
                count++;
                check = targets[i][1];
                // System.out.println(check + " " + count);
            } else {
                
                if (check >= targets[i][1]) {
                    check = targets[i][1];
                }
                
            }
        }
        
        return count+1;
    }
}