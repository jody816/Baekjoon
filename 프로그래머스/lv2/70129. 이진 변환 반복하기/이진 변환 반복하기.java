class Solution {
    public int[] solution(String s) {
        int[] answer;

        int zeroCountResult = 0, changeCount = 0;

        while (s.length() != 1) {
            changeCount++;

            int zeroCount = 0;

            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                    zeroCountResult++;
                }
            }

            int nonZLength = s.length() - zeroCount;

            s = Integer.toBinaryString(nonZLength);
        }

        answer = new int[]{changeCount, zeroCountResult};

        return answer;
    }
}