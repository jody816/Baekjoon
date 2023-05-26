import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int t = stdIn.nextInt();

        int[] result = new int[t];

        for (int i = 0; i < t; i++)
        {
            int count = 0;
            int n = stdIn.nextInt(), m = stdIn.nextInt();

            Queue<Integer> queue = new LinkedList<Integer>();
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int j = 0; j < n; j++)
            {
                int x = stdIn.nextInt();
                arrayList.add(x);
                queue.offer(x);
            }

            arrayList.sort(Collections.reverseOrder());

            while (true) {
                if ((queue.peek() == arrayList.get(0))) {

                    if (m == 0) {
                        result[i] = ++count;
                        break;
                    } else {
                        queue.remove();
                        arrayList.remove(0);
                        count++;
                    }
                } else {
                    queue.offer(queue.poll());
                }

                if (m == 0)
                    m = queue.size()-1;
                else
                    m--;
            }
        }
        
        for (int i = 0; i < t; i++)
        {
            System.out.println(result[i]);
        }
    }
}