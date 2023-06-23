import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int r = stdIn.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> find = new ArrayList<>();

        int[] check = new int[r];

        for (int i = 0; i < r; i++)
        {
            int v = stdIn.nextInt();

            if (!find.contains(v))
                find.add(v);

            check[i] = v;
        }

        int[][] array = new int[find.size()][2];
        for (int i = 0; i < find.size(); i++)
        {
            array[i][0] = find.get(i);
        }

        for (int i = 0; i < check.length; i++)
        {
            if (result.size() < n) {
                if (!result.contains(check[i]))
                    result.add(check[i]);

                for (int j = 0; j < find.size(); j++)
                {
                    if (array[j][0] == check[i]) {
                        array[j][1]++;
                        break;
                    }
                }
            } else {
                if (result.contains(check[i])) {
                    for (int j = 0; j < find.size(); j++)
                    {
                        if (array[j][0] == check[i]) {
                            array[j][1]++;
                            break;
                        }
                    }
                } else {

                    int[] who = new int[n];
                    int[][] findWho = new int[n][2];
                    int exit = 0;
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < find.size(); k++) {
                            if (result.get(j) == array[k][0]) {
                                who[j] = array[k][1];
                                findWho[j][0] = result.get(j);
                                findWho[j][1] = who[j];
                            }
                        }
                    }

                    Arrays.sort(who);

                    O : for (int j = 0; j < n; j++) {
                        for (int k = 0; k < find.size(); k++)
                        {
                            if (who[0] == array[k][1] && findWho[j][1] == who[0] && findWho[j][0] == array[k][0]) {
                                exit = array[k][0];
                                array[k][1] = 0;
                                break O;
                            }
                        }
                    }

                    result.remove(Integer.valueOf(exit));

                    result.add(check[i]);
                    for (int j = 0; j < find.size(); j++)
                    {
                        if (array[j][0] == check[i]) {
                            array[j][1]++;
                            break;
                        }
                    }
                }
            }
        }

        Collections.sort(result);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}