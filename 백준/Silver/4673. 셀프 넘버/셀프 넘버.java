import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 1; i <= 10000; i++)
        {
            number.add(i);
        }

        for (int i = 1; i <= 10000; i++)
        {
            String n = String.valueOf(i);
            int q = i;
            for (int j = 0; j < n.length(); j++)
            {
                q += Integer.parseInt(String.valueOf(n.charAt(j)));
            }

            if (number.contains(q)){
                number.remove(Integer.valueOf(q));
            }
        }

        for (int i = 0; i < number.size(); i++)
        {
            System.out.println(number.get(i));
        }
    }
}