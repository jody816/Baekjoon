import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int[] numbers) {
       Set<Integer> list = new HashSet<>();

       for (int i = 0; i < numbers.length-1; i++) {
         for (int j = i+1; j < numbers.length; j++) {
           list.add(numbers[i]+numbers[j]);
         }
       }

       int c = 0;
       int[] result = new int[list.size()];
       for (int num : list) {
         result[c++] = num;
       }

       Arrays.sort(result);

       return result;
    }
}