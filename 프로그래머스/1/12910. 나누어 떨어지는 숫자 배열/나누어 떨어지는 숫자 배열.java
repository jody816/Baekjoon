import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer s : arr) {
            if (s % divisor == 0)
                list.add(s);
        }

        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);

        if (result.length > 0)
            return result;
        else 
            return new int[]{-1};
    }
}