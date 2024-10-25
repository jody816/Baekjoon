class Solution {
    static int[] answer;
    public int[] solution(String[] keymap, String[] targets) {

    answer = new int[targets.length];

    for (int k = 0; k < targets.length; k++) {

      String target = targets[k];
      int n = 0;

      for (int i = 0; i < target.length(); i++) {

        String t = String.valueOf(target.charAt(i));
        int check = Integer.MAX_VALUE;
          
        for (String key : keymap) {
          int c = key.indexOf(t);
          if (c != -1) {
            check = Math.min(check, c+1);
          }
        }

        if (check == Integer.MAX_VALUE) {
            n = -1;
            break;
        } else n += check;
      }

      answer[k] = n;
    }

    return answer;
  }
}