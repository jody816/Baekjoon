class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char x = s.charAt(i);

            for (int j = 0; j < index; j++) {

                x++;

                char t = x;
                t--;
                if (t == 'z')
                    x = 'a';

                while (skip.contains(String.valueOf(x))) {
                    x++;

                    char g = x;
                    g--;
                    if (g == 'z')
                        x = 'a';
                }
            }

            sb.append(x);
        }

        return sb.toString();
    }
}