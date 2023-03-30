import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        ArrayList<Integer> result = new ArrayList<>();
        String[] first;
        ArrayList<Integer> third;
        int doc;
        String page;
        while (true) {
            do {
                doc = stdIn.nextInt();
            } while (doc > 1000);

            if (doc == 0)
                break;

            third = new ArrayList<>();

            page = stdIn.next();

            first = page.split(",");

            for (int i = 0; i < first.length; i++)
            {
                if (first[i].contains("-")) {
                    String[] second = first[i].split("-");
                    int low = Integer.parseInt(second[0]);
                    int high = Integer.parseInt(second[1]);

                    if (low <= high){
                        for (int j = low; j <= high; j++)
                        {
                            if (!third.contains(j))
                                third.add(j);
                        }
                    }
                } else {
                    if (!third.contains(Integer.parseInt(first[i])))
                        third.add(Integer.valueOf(first[i]));
                }
            }

            int count = 0;
            for (int i = 0; i < third.size(); i++)
            {
                if (third.get(i) <= doc)
                    count++;
            }

            result.add(count);
        }

        for (Integer integer : result) System.out.println(integer);
    }
}