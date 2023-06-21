class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = 1;
        
        while (number <= n) {
            int sum = 0;

            for (int i = number; i <= n; i++)
            {    
                sum += i;
                
                if (sum == n) {
                    answer++;
                    number++;
                    break;
                } else if (sum > n) {
                    number++;
                    break;
                }
            }
        }
        return answer;
    }
}