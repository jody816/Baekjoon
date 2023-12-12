import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(String[] wallpaper) {
        int a = wallpaper[0].length(), x = 0;

        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i++) {
            
            if (wallpaper[i].contains("#")) {
                if (a >= wallpaper[i].indexOf("#"))
                    a = wallpaper[i].indexOf("#");

                b.add(i);

                x = i+1;

                y.add(wallpaper[i].lastIndexOf("#")+1);
            }
        }

        Collections.sort(b);
        Collections.sort(y);

        int[] result = {b.get(0), a, x, y.get(y.size()-1)};

        return result;
    }
}