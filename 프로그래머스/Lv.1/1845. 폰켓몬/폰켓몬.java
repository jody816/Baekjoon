import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
        int n = nums.length/2;
    Set<Integer> set = new HashSet<>();
    for (int num : nums)
      set.add(num);

    int s = set.size();

    if (n <= 1) {
      return 1;
    } else if (n <= s) {
      return n;
    } else {
      return s;
    }
    }
}