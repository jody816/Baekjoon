class Solution {
    public int solution(int n) {
        int answer = 0;
        int plusN = n + 1;

        while (true) {
            String nb = Integer.toBinaryString(n), pb = Integer.toBinaryString(plusN);
            int nCount = 0, pCount = 0;

            for (int i = 0; i < nb.length(); i++)
            {
                if (nb.charAt(i) == '1')
                    nCount++;
            }

            for (int i = 0; i < pb.length(); i++)
            {
                if (pb.charAt(i) == '1')
                    pCount++;
            }

            if (nCount == pCount) {
                answer = plusN;
                break;
            } else {
                plusN++;
            }
        }
        return answer;
    }
}