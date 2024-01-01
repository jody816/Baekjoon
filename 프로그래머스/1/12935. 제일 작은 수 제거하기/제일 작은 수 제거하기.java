import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr)
            list.add(j);
        Arrays.sort(arr);
        list.remove(Integer.valueOf(arr[0]));

        if (list.size() == 0)
            return new int[]{-1};
        else
            return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}