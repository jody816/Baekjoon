import java.util.*;

class Solution {
    static int[] one = {1, 2, 3, 4, 5};
    static int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    public List<Integer> solution(int[] answers) {
        
        int[] person = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i%one.length]) person[0]++;
            if (answers[i] == two[i%two.length]) person[1]++;
            if (answers[i] == three[i%three.length]) person[2]++;
        }
        
        int max = Math.max(person[0], Math.max(person[1], person[2]));
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            if (max == person[i]) result.add(i+1);
        }
        
        return result;
    }
}