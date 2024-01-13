import java.util.ArrayList;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
    ArrayList<Integer> list = new ArrayList<>(score.length);
    list.add(score[0]);
    result[0] = list.get(0);
    for (int i = 1; i < score.length; i++) {
      for (int j = 0; j < list.size(); j++) {
        if (list.get(j) <= score[i]) {
          list.add(j, score[i]);
          break;
        }
      }
        
        if (score[i] < list.get(list.size()-1)) {
        list.add(score[i]);
      }
        
      if (list.size() < k) {
        result[i] = list.get(list.size()-1);
      } else {
        result[i] = list.get(k-1);
      }
    }
    return result;
    }
}