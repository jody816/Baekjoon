import java.util.*;

class Solution {
    static int result = 0;
    public int solution(int[] mats, String[][] park) {
        
        int col = park.length, row = park[0].length;
        
        T: for (int i = 0; i < mats.length; i++) {
            
            int n = mats[i];
            
            for (int j = 0; j < col; j++) {
                O: for (int k = 0; k < row; k++) {
                    
                    if (park[j][k].equals("-1")) {
                        for (int r = j; r < j+n; r++) {
                            for (int e = k; e < k+n; e++) {
                                if (r >= col || e >= row || !park[r][e].equals("-1")) {
                                    continue O;
                                }
                            }
                        }
                        
                        result = Math.max(result, n);
                        continue T;
                    }
                }
            }
        }
        
        return result == 0 ? -1 : result;
    }
}