import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n, w, l;

        do {
            n = stdIn.nextInt();
        } while (n > 1000 || n < 1);
        do {
            w = stdIn.nextInt();
        } while (w > 100 || w < 1);
        do {
            l = stdIn.nextInt();
        } while (l > 1000 || l < 10);

        ArrayList<Integer> truck = new ArrayList<>();
        int x;
        for (int i = 0; i < n; i++)
        {
            do {
                x = stdIn.nextInt();
            } while (x > 10 || x < 1);
            truck.add(x);
        }

        ArrayList<Integer> opposite = new ArrayList<>();
        boolean come = true;
        ArrayList<Integer> nowBridge = new ArrayList<>();
        int count = 0;

        while (opposite.size() != n) {
            int sum=0;
            for (int i = 0; i < nowBridge.size(); i++)
            {
                sum += nowBridge.get(i);
            }

            try{
                if (nowBridge.size() < w && sum + truck.get(0) <= l) {
                    nowBridge.add(truck.get(0));
                    truck.remove(0);
                } else {
                    nowBridge.add(0);
                }
            }catch (Exception e){
                nowBridge.add(0);
            }
            count++;

            if (nowBridge.size() == w){
                opposite.add(nowBridge.get(0));
                nowBridge.remove(0);
                opposite.remove(Integer.valueOf(0));
            }
        }

        System.out.println(count + 1);
    }
}