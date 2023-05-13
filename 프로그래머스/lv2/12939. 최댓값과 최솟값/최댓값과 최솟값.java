import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] r = s.split(" ");
        int[] g = new int[r.length];
        for (int i = 0; i < r.length; i++)
        {
            g[i] = Integer.parseInt(r[i]);
        }
        Arrays.sort(g);

        String answer = String.valueOf(g[0]) + " " + String.valueOf(g[g.length-1]);
        return answer;
    }
}