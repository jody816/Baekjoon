class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0, b = 0;
    for (int i = 0; i < goal.length; i++) {

      if (a <= cards1.length-1 && cards1[a].equals(goal[i])) {
        a++;
        continue;
      } else if (b <= cards2.length-1 && cards2[b].equals(goal[i])) {
        b++;
        continue;
      }

      return "No";
    }

    return "Yes";
    }
}