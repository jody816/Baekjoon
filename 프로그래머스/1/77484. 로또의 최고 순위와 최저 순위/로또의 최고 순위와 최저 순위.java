import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] result = new int[2];

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int match = 0;
        int zero = 0;

        for (int i = 0; i < win_nums.length; i++) {

            if (lottos[i] == 0) {
                zero++;
            }
            for (int lotto : lottos) {
                if (win_nums[i] == lotto)
                    match++;
            }
        }

        result[0] = 7 - (match+zero);
        result[1] = 7 - match;
        
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 6)
                result[i] = 6;
        }

        return result;
    }
}