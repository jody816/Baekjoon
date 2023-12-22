import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {

            if (!list.contains(words[i]) && words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)) {
                list.add(words[i]);
            } else {
                if (i%n == 0)
                    answer[0] = 1;
                else
                    answer[0] = (i%n) + 1;

                answer[1] = i/n + 1;

                break;
            }
        }

        return answer;
    }
}