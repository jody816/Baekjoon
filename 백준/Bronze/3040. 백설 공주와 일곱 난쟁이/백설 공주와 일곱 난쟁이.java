import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        ArrayList<Integer> dwarf = new ArrayList<>(9);

        int allSum = 0;
        int x;
        for (int i = 0; i < 9; i++) {
            do {
                x = stdIn.nextInt();
            } while (x > 99 || x < 1 || dwarf.contains(x));
            dwarf.add(x);
            allSum += x;
        }

        int fake = allSum - 100;

        for (int i = 0; i < dwarf.size()-1; i++)
        {
            for (int j = (i+1); j < dwarf.size(); j++)
            {
                if (dwarf.get(i)+dwarf.get(j) == fake){
                    int a = dwarf.get(i);
                    int b = dwarf.get(j);
                    dwarf.remove(Integer.valueOf(a));
                    dwarf.remove(Integer.valueOf(b));
                }
            }
        }

        for (int i = 0; i < dwarf.size(); i++)
        {
            System.out.println(dwarf.get(i));
        }
    }
}