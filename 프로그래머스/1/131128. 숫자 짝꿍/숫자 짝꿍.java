import java.util.*;

class Solution {
  public String solution(String X, String Y) {
    Map<Character,Integer> xMap = new HashMap<>();
    Map<Character,Integer> yMap = new HashMap<>();

    List<String> result = new ArrayList<>();

    for (int i = 0; i < X.length(); i++) {
      xMap.put(X.charAt(i), xMap.getOrDefault(X.charAt(i), 0) + 1);
    }

    for (int i = 0; i < Y.length(); i++) {
      yMap.put(Y.charAt(i),yMap.getOrDefault(Y.charAt(i), 0) + 1);
    }

    for (Character c : xMap.keySet()) {

      int length = Math.min(xMap.get(c), yMap.getOrDefault(c, 0));

      for (int i = 0; i < length; i++) {
        result.add(String.valueOf(c));
      }
    }

    if (result.size() == 0) return "-1";

    result.sort(Collections.reverseOrder());

    return result.get(0).equals("0") ? "0" : String.join("", result);
  }
}