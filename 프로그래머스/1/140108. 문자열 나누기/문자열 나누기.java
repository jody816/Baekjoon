class Solution {
    public int solution(String s) {
int count = 0;
        int match = 0;
        int different = 0;
        char x = '?';

        for (int i = 0; i < s.length(); i++) {

            if (x == '?') {
                x = s.charAt(i);
                match++;
            } else {

                if (x == s.charAt(i))
                    match++;
                else
                    different++;

                if (match == different) {
                    count++;
                    match = 0;
                    different = 0;
                    x = '?';
                }
            }

            if (i == s.length()-1 && match >= 1)
                count++;
        }

        return count;
    }
}