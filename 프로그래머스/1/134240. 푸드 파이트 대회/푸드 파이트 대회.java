class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] > 1) {
                if (food[i] % 2 == 0) {
                    for (int j = 0; j < food[i]/2; j++) {
                        answer += String.valueOf(i);
                    }
                } else {
                    for (int j = 0; j < (food[i]-1)/2; j++) {
                        answer += String.valueOf(i);
                    }
                }
            }
        }
        
        answer += "0";
        int l = answer.length()-2;
        for (int i = l; i >= 0; i--) {
            answer += String.valueOf(answer.charAt(i));
        }
        
        return answer;
    }
}