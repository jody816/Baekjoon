class Solution {
    public int solution(int[] numbers) {
        int sum = 45;

        for (int number : numbers) {
            sum -= number;
        }

        return sum;
    }
}