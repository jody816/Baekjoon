import java.util.ArrayList;
class Solution {
    static int[] one = {1,2,3,4,5};
    static int[] two = {2,1,2,3,2,4,2,5};
    static int[] three = {3,3,1,1,2,2,4,4,5,5};
    
    public int[] solution(int[] answers) {
        int max = 0;
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i%one.length]) {
                score[0]++;
            }
            if (answers[i] == two[i%two.length]) {
                score[1]++;
            }
            if (answers[i] == three[i%three.length]) {
                score[2]++;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            if (max < score[i])
                max = score[i];
        }
        
        for (int i = 0; i < 3; i++) {
            if (max == score[i])
                list.add(i+1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}