import java.util.*;

class Solution {
    static int subscriber = 0, maxProfit = 0;

  public int[] solution(int[][] users, int[] emoticons) {

    // 임티 할인율 배열
    int[] rate = new int[emoticons.length];

    dfs(users, emoticons, rate, 0);

    return new int[]{subscriber, maxProfit};
  }

  static private void dfs(int[][] users, int[] emoticons, int[] rate, int depth) {
    if (depth == rate.length) {
      calculation(users, emoticons, rate);
      return;
    }

    for (int i = 10; i <= 40; i+=10) {
      rate[depth] = i;
      dfs(users, emoticons, rate, depth+1);
    }
  }

  static private void calculation(int[][] users, int[] emoticons, int[] rate) {

    int sub = 0, profit = 0;

    O: for (int[] user : users) {

      int sum = 0;

      int userRate = user[0];
      int cutLine = user[1];

      for (int i = 0; i < emoticons.length; i++) {

        if (userRate <= rate[i]) {

          sum += (emoticons[i] - ((emoticons[i]/100) * rate[i]));
            
            if (cutLine <= sum) {
                sub++;
                continue O;
            }
        }
      }

      profit += sum;
    }

    // 리턴 값 갱신
    if (subscriber < sub) {
      subscriber = sub;
      maxProfit = profit;
    } else if (subscriber == sub) {
      maxProfit = Math.max(maxProfit, profit);
    }
  }
}