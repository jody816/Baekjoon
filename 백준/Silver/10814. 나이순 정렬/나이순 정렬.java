import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

class Member {
    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static ArrayList<Member> members = new ArrayList<>();
    public static HashMap<Member, Integer> indexMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            Member member = new Member(age, name);
            members.add(member);
            indexMap.put(member, i);
        }

        members.sort((o1, o2) -> {
            if (o1.age == o2.age)
                return Integer.compare(indexMap.get(o1), indexMap.get(o2));
            return Integer.compare(o1.age, o2.age);
        });

        for (Member member : members)
            bw.write(member.age + " " + member.name + "\n");

        bw.flush();
        bw.close();
    }
}
