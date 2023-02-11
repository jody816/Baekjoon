import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            n = stdIn.nextInt();
        }while (n > 1000 || n < 1);

        ArrayList<String> bookList = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            bookList.add(stdIn.next());
        }

        ArrayList<String> result = new ArrayList<>();
        int max = Collections.frequency(bookList, bookList.get(0));
        result.add(bookList.get(0));
        for (int i = 1; i < n; i++)
        {
            if (Collections.frequency(bookList, bookList.get(i)) > max){
                max = Collections.frequency(bookList, bookList.get(i));
                result.clear();
                result.add(bookList.get(i));
            }
        }

        while (bookList.remove(result.get(0))){}

        for (int i = 0; i < bookList.size(); i++)
        {
            if (max == Collections.frequency(bookList, bookList.get(i))){
                result.add(bookList.get(i));
            }
        }
        Collections.sort(result);

        System.out.println(result.get(0));
    }
}