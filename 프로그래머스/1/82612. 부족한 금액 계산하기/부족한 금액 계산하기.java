class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += ((long) price * i);
        }

        long result = money - sum;

        if (result < 0)
            return Math.abs(result);
        else
            return 0;
    }
}