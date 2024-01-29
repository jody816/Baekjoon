import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String text = br.readLine();
    int t = Integer.parseInt(br.readLine());

    LinkedList<Character> list = new LinkedList<>();

    for (int i = 0; i < text.length(); i++) {
      list.add(text.charAt(i));
    }

    //iterator 메소드 호출 
    ListIterator<Character> iter = list.listIterator();
    //처음 커서는 문장의 맨 뒤에 있어야하기 때문에 커서를 맨뒤로 이동시켜줌 (ex. abc|)

    while(iter.hasNext()) {
      iter.next();
    }

    for(int i = 0; i < t; i++) {
      String command = br.readLine();
      char c = command.charAt(0);
      switch(c) {
        case 'L':
          if(iter.hasPrevious())
            iter.previous();

          break;
        case 'D':
          if(iter.hasNext())
            iter.next();

          break;
        case 'B':
          //remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거함
          if(iter.hasPrevious()) {
            iter.previous();
            iter.remove();
          }
          break;
        case 'P':
          char a = command.charAt(2);
          iter.add(a);
          break;
      }
    }
    for(Character chr : list) {
      bw.write(chr);
    }
    bw.flush();
    bw.close();
  }
}
