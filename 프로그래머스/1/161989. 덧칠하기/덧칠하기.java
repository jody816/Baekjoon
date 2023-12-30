import java.util.ArrayList;
class Solution {
    public int solution(int n, int m, int[] section) {
        if (section.length == 1)
            return 1;

        ArrayList<Integer> list = new ArrayList<>();
        for (int j : section)
            list.add(j);

        list.add(0);

        int count = 0;

        for (int i = section[0]; i <= section[section.length-1]; i++) {
            if (list.get(0) == i) {
                list.remove(0);
                i--;
                for (int j = 0; j < m; j++) {
                    i++;

                    if (list.get(0) == i) {
                        list.remove(0);
                    }
                }

                count++;
            }
        }

        return count;
    }
}