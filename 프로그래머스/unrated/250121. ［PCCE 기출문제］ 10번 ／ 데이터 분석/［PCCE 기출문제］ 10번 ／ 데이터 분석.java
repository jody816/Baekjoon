import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();

        switch (ext) {
            case "code":
                for (int[] datum : data)
                    if (datum[0] < val_ext)
                        list.add(datum);
                break;

            case "date":
                for (int[] datum : data)
                    if (datum[1] < val_ext)
                        list.add(datum);
                break;

            case "maximum":
                for (int[] datum : data)
                    if (datum[2] < val_ext)
                        list.add(datum);
                break;

            case "remain":
                for (int[] datum : data)
                    if (datum[3] < val_ext)
                        list.add(datum);
                break;
        }

        int k = 0;

        switch (sort_by) {
            case "date":
                k = 1;
                break;

            case "maximum":
                k = 2;
                break;

            case "remain":
                k = 3;
                break;
        }

        int finalK = k;
        list.sort(Comparator.comparing(arr -> arr[finalK]));

        return list.toArray(new int[list.size()][]);
    }
}