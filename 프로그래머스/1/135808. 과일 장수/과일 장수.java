import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int result = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = score.length-1; i >= 0; i--) {

            list.add(0, score[i]);

            if (list.size() == m) {
                int x = list.get(0)*m;
                result += x;
                list = new ArrayList<>();
            }
        }

        return result;
    }
}