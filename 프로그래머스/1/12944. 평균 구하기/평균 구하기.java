class Solution {
    public double solution(int[] arr) {
        
        double sum = 0;

        for (int j : arr)
            sum += j;
        
        return sum/arr.length;
    }
}