class Solution {
    public int solution(int[] nums) {
        
        int count = 0;
        
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                O: for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i]+nums[j]+nums[k];
                    for (int v = 2; v < sum; v++) {
                        if (sum % v == 0) {
                             continue O;
                        }
                    }
                    count++;
                }
            }
        }
        
        return count;
    }
}